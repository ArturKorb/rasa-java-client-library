package io.github.arturkorb.rasa;

import com.google.gson.reflect.TypeToken;
import io.github.arturkorb.connection.ApiClient;
import io.github.arturkorb.connection.Configuration;
import io.github.arturkorb.rasa.model.*;
import io.github.arturkorb.utils.ApiCallback;
import io.github.arturkorb.utils.ApiException;
import io.github.arturkorb.utils.ApiResponse;
import io.github.arturkorb.utils.Pair;
import okhttp3.OkHttpClient;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.lang.reflect.Type;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RasaClient {

    private final static String DEFAULT_BASE_PATH = "http://localhost:5005";
    private final static String DEFAULT_CHANNEL = "rest";
    private final static String MIME_TYPE = "application/json";

    private ApiClient apiClient;

    private ModelApi modelApi;
    private DomainApi domainApi;
    private TrackerApi trackerApi;
    private ServerInformationApi serverInformationApi;
    private String basePath;
    private String channel;
    private String botPath;

    public RasaClient() {
        this.basePath = DEFAULT_BASE_PATH;
        this.channel = DEFAULT_CHANNEL;
        this.apiClient = Configuration.getDefaultApiClient();
        this.botPath = "/webhooks/" + this.channel + "/webhook";
        this.apiClient.setBasePath(this.basePath);
        this.modelApi = new ModelApi();
        this.domainApi = new DomainApi();
        this.trackerApi = new TrackerApi();
        this.serverInformationApi = new ServerInformationApi();
    }

    public RasaClient withBasePath(String basePath) {
        this.basePath = basePath;
        this.apiClient.setBasePath(this.basePath);
        return this;
    }

    public RasaClient withChannel(String channel) {
        this.channel = channel;
        this.botPath = "/webhooks/" + this.channel + "/webhook";
        return this;
    }

    public RasaClient withAuthToken(String authToken) {
        this.apiClient.setApiKey(authToken);
        return this;
    }

    public RasaClient withProxy(Proxy proxy) {
        this.apiClient.setHttpClient(this.apiClient.getHttpClient().newBuilder().proxy(proxy).build());
        return this;
    }

    public BotAnswer sendMessage(String message, String sender) throws ApiException {
        UserMessage userMessage = new UserMessage().message(message).sender(sender);
        ApiResponse<BotAnswer> localVarResp = sendMessageWithHttpInfo(userMessage);
        return localVarResp.getData();
    }

    public BotAnswer sendUserMessage(UserMessage userMessage) throws ApiException {
        ApiResponse<BotAnswer> localVarResp = sendMessageWithHttpInfo(userMessage);
        return localVarResp.getData();
    }

    public Context sendMessageWithContextRetrieval(String message, String sender) throws ApiException {
        UserMessage userMessage = new UserMessage().message(message).sender(sender);
        BotAnswer botAnswer = sendUserMessage(userMessage);
        Tracker tracker = trackerApi.getConversationTracker(sender, "APPLIED", null);
        Context context = new Context();
        context.setBotAnswer(botAnswer);
        context.setLatestAction(tracker.getLatestAction());
        context.setParseResult(tracker.getLatestMessage());
        context.setSlots(tracker.getSlots());
        context.setUserMessage(userMessage);
        return context;
    }

    public void trainModel(YAMLTrainingRequest yamlTrainingRequest) throws ApiException {
        if (StringUtils.isEmpty(yamlTrainingRequest.getConfig())) {
            throw new ApiException("Missing the required parameter 'config' when calling trainModel method!");
        }
        if ((!StringUtils.isEmpty(yamlTrainingRequest.getStories())
                || !StringUtils.isEmpty(yamlTrainingRequest.getRules()))
                && StringUtils.isEmpty(yamlTrainingRequest.getDomain())) {
            throw new ApiException("Missing the required parameter 'domain' when calling trainModel method " +
                    "with stories or rules !");
        }

        //train and load the model
        modelApi.trainModelAsync(yamlTrainingRequest, true, false, "", new ModelLoader());
    }

    public void trainModel(String config, String domain, String nluTrainingDataYaml,
                           String storiesTrainingDataYaml, String rulesTrainingDataYaml, String responses) throws ApiException {
        YAMLTrainingRequest yamlTrainingRequest = new YAMLTrainingRequest().config(config).domain(domain)
                .nlu(nluTrainingDataYaml).stories(storiesTrainingDataYaml).rules(rulesTrainingDataYaml)
                .responses(responses);
        trainModel(yamlTrainingRequest);
    }

    public void setChannel(String channel) {
        this.channel = channel;
        this.botPath = "/webhooks/" + this.channel + "/webhook";
    }

    public String getChannel() {
        return this.channel;
    }

    public String getBasePath() {
        return this.basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
        this.apiClient.setBasePath(basePath);
    }

    private ApiResponse<BotAnswer> sendMessageWithHttpInfo(UserMessage message) throws ApiException {
        okhttp3.Call localVarCall = sendMessageValidateBeforeCall(message);
        Type localVarReturnType = new TypeToken<BotAnswer>() {
        }.getType();
        return this.apiClient.execute(localVarCall, localVarReturnType);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call sendMessageValidateBeforeCall(UserMessage message) throws ApiException {

        // verify the required parameter 'sender' is set
        if (message.getSender() == null) {
            throw new ApiException("Missing the required parameter 'sender' when calling sendMessage");
        }
        if (message.getMessage() == null) {
            message.setMessage("");
        }
        okhttp3.Call localVarCall = sendMessageCall(message);
        return localVarCall;
    }

    private okhttp3.Call sendMessageCall(UserMessage message) throws ApiException {
        Object localVarPostBody = message;

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarHeaderParams.put("Accept", MIME_TYPE);
        localVarHeaderParams.put("Content-Type", MIME_TYPE);

        String[] localVarAuthNames = new String[]{"JWT", "TokenAuth"};
        return apiClient.buildCall(botPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, null);
    }


    private class ModelLoader implements ApiCallback<File> {


        public ModelLoader() {
        }

        @Override
        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            e.printStackTrace();
        }

        @Override
        public void onSuccess(File result, int statusCode, Map<String, List<String>> responseHeaders) {
            loadModel(responseHeaders.get("filename"));
        }

        @Override
        public void onUploadProgress(long bytesWritten, long contentLength, boolean done) {

        }

        @Override
        public void onDownloadProgress(long bytesRead, long contentLength, boolean done) {

        }

        private void loadModel(List<String> fileProperties) {
            ModelRequest modelRequest = new ModelRequest();
            modelRequest = modelRequest.modelFile("/app/models/" + fileProperties.get(0));
            try {
                modelApi.replaceModel(modelRequest);
            } catch (ApiException e) {
                e.printStackTrace();
            }
        }
    }
}
