/*
 * Rasa - Server Endpoints
 * The Rasa server provides endpoints to retrieve trackers of conversations as well as endpoints to modify them. Additionally, endpoints for training and testing models are provided.
 *
 * The version of the OpenAPI document: 1.0.0
 *
 */


package io.github.arturkorb.rasa;

import com.google.gson.reflect.TypeToken;
import io.github.arturkorb.connection.ApiClient;
import io.github.arturkorb.connection.Configuration;
import io.github.arturkorb.rasa.model.*;
import io.github.arturkorb.utils.ApiCallback;
import io.github.arturkorb.utils.ApiException;
import io.github.arturkorb.utils.ApiResponse;
import io.github.arturkorb.utils.Pair;

import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModelApi {

    private ApiClient localVarApiClient;

    public ModelApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ModelApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for parseModelMessage
     *
     * @param inlineObject  (required)
     * @param emulationMode Specify the emulation mode. (optional)
     * @param _callback     Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call parseModelMessageCall(InlineObject inlineObject, String emulationMode, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inlineObject;

        // create path and map variables
        String localVarPath = "/model/parse";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (emulationMode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("emulation_mode", emulationMode));
        }

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{"JWT", "TokenAuth"};
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call parseModelMessageValidateBeforeCall(InlineObject inlineObject, String emulationMode, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'inlineObject' is set
        if (inlineObject == null) {
            throw new ApiException("Missing the required parameter 'inlineObject' when calling parseModelMessage(Async)");
        }


        okhttp3.Call localVarCall = parseModelMessageCall(inlineObject, emulationMode, _callback);
        return localVarCall;

    }

    /**
     * Parse a message using the Rasa model
     * Predicts the intent and entities of the message posted to this endpoint. No messages will be stored to a conversation and no action will be run. This will just retrieve the NLU parse results.
     *
     * @param inlineObject  (required)
     * @param emulationMode Specify the emulation mode. (optional)
     * @return ParseResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public ParseResult parseModelMessage(InlineObject inlineObject, String emulationMode) throws ApiException {
        ApiResponse<ParseResult> localVarResp = parseModelMessageWithHttpInfo(inlineObject, emulationMode);
        return localVarResp.getData();
    }

    /**
     * Parse a message using the Rasa model
     * Predicts the intent and entities of the message posted to this endpoint. No messages will be stored to a conversation and no action will be run. This will just retrieve the NLU parse results.
     *
     * @param inlineObject  (required)
     * @param emulationMode Specify the emulation mode. (optional)
     * @return ApiResponse&lt;ParseResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<ParseResult> parseModelMessageWithHttpInfo(InlineObject inlineObject, String emulationMode) throws ApiException {
        okhttp3.Call localVarCall = parseModelMessageValidateBeforeCall(inlineObject, emulationMode, null);
        Type localVarReturnType = new TypeToken<ParseResult>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Parse a message using the Rasa model (asynchronously)
     * Predicts the intent and entities of the message posted to this endpoint. No messages will be stored to a conversation and no action will be run. This will just retrieve the NLU parse results.
     *
     * @param inlineObject  (required)
     * @param emulationMode Specify the emulation mode. (optional)
     * @param _callback     The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call parseModelMessageAsync(InlineObject inlineObject, String emulationMode, final ApiCallback<ParseResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = parseModelMessageValidateBeforeCall(inlineObject, emulationMode, _callback);
        Type localVarReturnType = new TypeToken<ParseResult>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for predictModelAction
     *
     * @param event         (required)
     * @param includeEvents Specify which events of the tracker the response should contain. (optional, default to AFTER_RESTART)
     * @param _callback     Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The request conflicts with the currently loaded model. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call predictModelActionCall(List<Event> event, String includeEvents, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = event;

        // create path and map variables
        String localVarPath = "/model/predict";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (includeEvents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include_events", includeEvents));
        }

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{"JWT", "TokenAuth"};
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call predictModelActionValidateBeforeCall(List<Event> event, String includeEvents, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'event' is set
        if (event == null) {
            throw new ApiException("Missing the required parameter 'event' when calling predictModelAction(Async)");
        }


        okhttp3.Call localVarCall = predictModelActionCall(event, includeEvents, _callback);
        return localVarCall;

    }

    /**
     * Predict an action on a temporary state
     * Predicts the next action on the tracker state as it is posted to this endpoint. Rasa will create a temporary tracker from the provided events and will use it to predict an action. No messages will be sent and no action will be run.
     *
     * @param event         (required)
     * @param includeEvents Specify which events of the tracker the response should contain. (optional, default to AFTER_RESTART)
     * @return PredictResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The request conflicts with the currently loaded model. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public PredictResult predictModelAction(List<Event> event, String includeEvents) throws ApiException {
        ApiResponse<PredictResult> localVarResp = predictModelActionWithHttpInfo(event, includeEvents);
        return localVarResp.getData();
    }

    /**
     * Predict an action on a temporary state
     * Predicts the next action on the tracker state as it is posted to this endpoint. Rasa will create a temporary tracker from the provided events and will use it to predict an action. No messages will be sent and no action will be run.
     *
     * @param event         (required)
     * @param includeEvents Specify which events of the tracker the response should contain. (optional, default to AFTER_RESTART)
     * @return ApiResponse&lt;PredictResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The request conflicts with the currently loaded model. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<PredictResult> predictModelActionWithHttpInfo(List<Event> event, String includeEvents) throws ApiException {
        okhttp3.Call localVarCall = predictModelActionValidateBeforeCall(event, includeEvents, null);
        Type localVarReturnType = new TypeToken<PredictResult>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Predict an action on a temporary state (asynchronously)
     * Predicts the next action on the tracker state as it is posted to this endpoint. Rasa will create a temporary tracker from the provided events and will use it to predict an action. No messages will be sent and no action will be run.
     *
     * @param event         (required)
     * @param includeEvents Specify which events of the tracker the response should contain. (optional, default to AFTER_RESTART)
     * @param _callback     The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The request conflicts with the currently loaded model. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call predictModelActionAsync(List<Event> event, String includeEvents, final ApiCallback<PredictResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = predictModelActionValidateBeforeCall(event, includeEvents, _callback);
        Type localVarReturnType = new TypeToken<PredictResult>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for replaceModel
     *
     * @param modelRequest (required)
     * @param _callback    Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Model was successfully replaced. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call replaceModelCall(ModelRequest modelRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = modelRequest;

        // create path and map variables
        String localVarPath = "/model";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{"JWT", "TokenAuth"};
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call replaceModelValidateBeforeCall(ModelRequest modelRequest, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'modelRequest' is set
        if (modelRequest == null) {
            throw new ApiException("Missing the required parameter 'modelRequest' when calling replaceModel(Async)");
        }


        okhttp3.Call localVarCall = replaceModelCall(modelRequest, _callback);
        return localVarCall;

    }

    /**
     * Replace the currently loaded model
     * Updates the currently loaded model. First, tries to load the model from the local storage system. Secondly, tries to load the model from the provided model server configuration. Last, tries to load the model from the provided remote storage.
     *
     * @param modelRequest (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Model was successfully replaced. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public void replaceModel(ModelRequest modelRequest) throws ApiException {
        replaceModelWithHttpInfo(modelRequest);
    }

    /**
     * Replace the currently loaded model
     * Updates the currently loaded model. First, tries to load the model from the local storage system. Secondly, tries to load the model from the provided model server configuration. Last, tries to load the model from the provided remote storage.
     *
     * @param modelRequest (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Model was successfully replaced. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> replaceModelWithHttpInfo(ModelRequest modelRequest) throws ApiException {
        okhttp3.Call localVarCall = replaceModelValidateBeforeCall(modelRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Replace the currently loaded model (asynchronously)
     * Updates the currently loaded model. First, tries to load the model from the local storage system. Secondly, tries to load the model from the provided model server configuration. Last, tries to load the model from the provided remote storage.
     *
     * @param modelRequest (required)
     * @param _callback    The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Model was successfully replaced. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call replaceModelAsync(ModelRequest modelRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = replaceModelValidateBeforeCall(modelRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    /**
     * Build call for testModelIntent
     *
     * @param body                 (required)
     * @param model                Model that should be used for evaluation. If the parameter is set, the model will be fetched with the currently loaded configuration setup. However, the currently loaded model will not be updated. The state of the server will not change. If the parameter is not set, the currently loaded model will be used for the evaluation. (optional)
     * @param callbackUrl          If specified the call will return immediately with an empty response and status code 204. The actual result or any errors will be sent to the given callback URL as the body of a post request. (optional, default to &quot;None&quot;)
     * @param crossValidationFolds (optional)
     * @param _callback            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> NLU evaluation result </td><td>  -  </td></tr>
     * <tr><td> 204 </td><td> The incoming request specified a &#x60;callback_url&#x60; and hence the request will return immediately with an empty response. The actual response will be sent to the provided &#x60;callback_url&#x60; via POST request. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The request conflicts with the currently loaded model. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call testModelIntentCall(String body, String model, String callbackUrl, Integer crossValidationFolds, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/model/test/intents";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (model != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("model", model));
        }

        if (callbackUrl != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("callback_url", callbackUrl));
        }

        if (crossValidationFolds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cross_validation_folds", crossValidationFolds));
        }

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
                "application/x-yaml"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{"JWT", "TokenAuth"};
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call testModelIntentValidateBeforeCall(String body, String model, String callbackUrl, Integer crossValidationFolds, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling testModelIntent(Async)");
        }


        okhttp3.Call localVarCall = testModelIntentCall(body, model, callbackUrl, crossValidationFolds, _callback);
        return localVarCall;

    }

    /**
     * Perform an intent evaluation
     * Evaluates NLU model against a model or using cross-validation.
     *
     * @param body                 (required)
     * @param model                Model that should be used for evaluation. If the parameter is set, the model will be fetched with the currently loaded configuration setup. However, the currently loaded model will not be updated. The state of the server will not change. If the parameter is not set, the currently loaded model will be used for the evaluation. (optional)
     * @param callbackUrl          If specified the call will return immediately with an empty response and status code 204. The actual result or any errors will be sent to the given callback URL as the body of a post request. (optional, default to &quot;None&quot;)
     * @param crossValidationFolds (optional)
     * @return NLUEvaluationResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> NLU evaluation result </td><td>  -  </td></tr>
     * <tr><td> 204 </td><td> The incoming request specified a &#x60;callback_url&#x60; and hence the request will return immediately with an empty response. The actual response will be sent to the provided &#x60;callback_url&#x60; via POST request. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The request conflicts with the currently loaded model. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public NLUEvaluationResult testModelIntent(String body, String model, String callbackUrl, Integer crossValidationFolds) throws ApiException {
        ApiResponse<NLUEvaluationResult> localVarResp = testModelIntentWithHttpInfo(body, model, callbackUrl, crossValidationFolds);
        return localVarResp.getData();
    }

    /**
     * Perform an intent evaluation
     * Evaluates NLU model against a model or using cross-validation.
     *
     * @param body                 (required)
     * @param model                Model that should be used for evaluation. If the parameter is set, the model will be fetched with the currently loaded configuration setup. However, the currently loaded model will not be updated. The state of the server will not change. If the parameter is not set, the currently loaded model will be used for the evaluation. (optional)
     * @param callbackUrl          If specified the call will return immediately with an empty response and status code 204. The actual result or any errors will be sent to the given callback URL as the body of a post request. (optional, default to &quot;None&quot;)
     * @param crossValidationFolds (optional)
     * @return ApiResponse&lt;NLUEvaluationResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> NLU evaluation result </td><td>  -  </td></tr>
     * <tr><td> 204 </td><td> The incoming request specified a &#x60;callback_url&#x60; and hence the request will return immediately with an empty response. The actual response will be sent to the provided &#x60;callback_url&#x60; via POST request. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The request conflicts with the currently loaded model. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<NLUEvaluationResult> testModelIntentWithHttpInfo(String body, String model, String callbackUrl, Integer crossValidationFolds) throws ApiException {
        okhttp3.Call localVarCall = testModelIntentValidateBeforeCall(body, model, callbackUrl, crossValidationFolds, null);
        Type localVarReturnType = new TypeToken<NLUEvaluationResult>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Perform an intent evaluation (asynchronously)
     * Evaluates NLU model against a model or using cross-validation.
     *
     * @param body                 (required)
     * @param model                Model that should be used for evaluation. If the parameter is set, the model will be fetched with the currently loaded configuration setup. However, the currently loaded model will not be updated. The state of the server will not change. If the parameter is not set, the currently loaded model will be used for the evaluation. (optional)
     * @param callbackUrl          If specified the call will return immediately with an empty response and status code 204. The actual result or any errors will be sent to the given callback URL as the body of a post request. (optional, default to &quot;None&quot;)
     * @param crossValidationFolds (optional)
     * @param _callback            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> NLU evaluation result </td><td>  -  </td></tr>
     * <tr><td> 204 </td><td> The incoming request specified a &#x60;callback_url&#x60; and hence the request will return immediately with an empty response. The actual response will be sent to the provided &#x60;callback_url&#x60; via POST request. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The request conflicts with the currently loaded model. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call testModelIntentAsync(String body, String model, String callbackUrl, Integer crossValidationFolds, final ApiCallback<NLUEvaluationResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = testModelIntentValidateBeforeCall(body, model, callbackUrl, crossValidationFolds, _callback);
        Type localVarReturnType = new TypeToken<NLUEvaluationResult>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for testModelStories
     *
     * @param body      (required)
     * @param e2e       Perform an end-to-end evaluation on the posted stories. (optional, default to false)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The request conflicts with the currently loaded model. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call testModelStoriesCall(String body, Boolean e2e, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/model/test/stories";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (e2e != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("e2e", e2e));
        }

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
                "text/yml"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{"JWT", "TokenAuth"};
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call testModelStoriesValidateBeforeCall(String body, Boolean e2e, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling testModelStories(Async)");
        }


        okhttp3.Call localVarCall = testModelStoriesCall(body, e2e, _callback);
        return localVarCall;

    }

    /**
     * Evaluate stories
     * Evaluates one or multiple stories against the currently loaded Rasa model.
     *
     * @param body (required)
     * @param e2e  Perform an end-to-end evaluation on the posted stories. (optional, default to false)
     * @return EvaluationStoriesResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The request conflicts with the currently loaded model. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public EvaluationStoriesResult testModelStories(String body, Boolean e2e) throws ApiException {
        ApiResponse<EvaluationStoriesResult> localVarResp = testModelStoriesWithHttpInfo(body, e2e);
        return localVarResp.getData();
    }

    /**
     * Evaluate stories
     * Evaluates one or multiple stories against the currently loaded Rasa model.
     *
     * @param body (required)
     * @param e2e  Perform an end-to-end evaluation on the posted stories. (optional, default to false)
     * @return ApiResponse&lt;EvaluationStoriesResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The request conflicts with the currently loaded model. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<EvaluationStoriesResult> testModelStoriesWithHttpInfo(String body, Boolean e2e) throws ApiException {
        okhttp3.Call localVarCall = testModelStoriesValidateBeforeCall(body, e2e, null);
        Type localVarReturnType = new TypeToken<EvaluationStoriesResult>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Evaluate stories (asynchronously)
     * Evaluates one or multiple stories against the currently loaded Rasa model.
     *
     * @param body      (required)
     * @param e2e       Perform an end-to-end evaluation on the posted stories. (optional, default to false)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The request conflicts with the currently loaded model. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call testModelStoriesAsync(String body, Boolean e2e, final ApiCallback<EvaluationStoriesResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = testModelStoriesValidateBeforeCall(body, e2e, _callback);
        Type localVarReturnType = new TypeToken<EvaluationStoriesResult>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for trainModel
     *
     * @param trainingRequest             The training data can either be in YAML format or a JSON which contains Rasa training data in YAML format for each required key. (required)
     * @param saveToDefaultModelDirectory (optional, default to true)
     * @param forceTraining               (optional, default to false)
     * @param callbackUrl                 If specified the call will return immediately with an empty response and status code 204. The actual result or any errors will be sent to the given callback URL as the body of a post request. (optional, default to &quot;None&quot;)
     * @param _callback                   Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Zipped Rasa model </td><td>  * filename - File name of the trained model. <br>  </td></tr>
     * <tr><td> 204 </td><td> The incoming request specified a &#x60;callback_url&#x60; and hence the request will return immediately with an empty response. The actual response will be sent to the provided &#x60;callback_url&#x60; via POST request. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call trainModelCall(TrainingRequest trainingRequest, Boolean saveToDefaultModelDirectory, Boolean forceTraining, String callbackUrl, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody;

        // create path and map variables
        String localVarPath = "/model/train";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (saveToDefaultModelDirectory != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("save_to_default_model_directory", saveToDefaultModelDirectory));
        }

        if (forceTraining != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("force_training", forceTraining));
        }

        if (callbackUrl != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("callback_url", callbackUrl));
        }

        String[] localVarAuthNames = new String[]{"JWT", "TokenAuth"};
        localVarHeaderParams.put("Content-Type", trainingRequest.getContentType());
        localVarPostBody = trainingRequest.getPayload();

        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call trainModelValidateBeforeCall(TrainingRequest trainingRequest, Boolean saveToDefaultModelDirectory, Boolean forceTraining, String callbackUrl, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'trainingRequest' is set
        if (trainingRequest == null) {
            throw new ApiException("Missing the required parameter 'trainingRequest' when calling trainModel(Async)");
        }


        okhttp3.Call localVarCall = trainModelCall(trainingRequest, saveToDefaultModelDirectory, forceTraining, callbackUrl, _callback);
        return localVarCall;

    }

    /**
     * Train a Rasa model
     * Trains a new Rasa model. Depending on the data given only a dialogue model, only a NLU model, or a model combining a trained dialogue model with an NLU model will be trained. The new model is not loaded by default.
     *
     * @param trainingRequest             The training data can either be in YAML format or a JSON which contains Rasa training data in YAML format for each required key. (required)
     * @param saveToDefaultModelDirectory (optional, default to true)
     * @param forceTraining               (optional, default to false)
     * @param callbackUrl                 If specified the call will return immediately with an empty response and status code 204. The actual result or any errors will be sent to the given callback URL as the body of a post request. (optional, default to &quot;None&quot;)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Zipped Rasa model </td><td>  * filename - File name of the trained model. <br>  </td></tr>
     * <tr><td> 204 </td><td> The incoming request specified a &#x60;callback_url&#x60; and hence the request will return immediately with an empty response. The actual response will be sent to the provided &#x60;callback_url&#x60; via POST request. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public File trainModel(TrainingRequest trainingRequest, Boolean saveToDefaultModelDirectory, Boolean forceTraining, String callbackUrl) throws ApiException {
        ApiResponse<File> localVarResp = trainModelWithHttpInfo(trainingRequest, saveToDefaultModelDirectory, forceTraining, callbackUrl);
        return localVarResp.getData();
    }

    /**
     * Train a Rasa model
     * Trains a new Rasa model. Depending on the data given only a dialogue model, only a NLU model, or a model combining a trained dialogue model with an NLU model will be trained. The new model is not loaded by default.
     *
     * @param trainingRequest             The training data can either be in YAML format or a JSON which contains Rasa training data in YAML format for each required key. (required)
     * @param saveToDefaultModelDirectory (optional, default to true)
     * @param forceTraining               (optional, default to false)
     * @param callbackUrl                 If specified the call will return immediately with an empty response and status code 204. The actual result or any errors will be sent to the given callback URL as the body of a post request. (optional, default to &quot;None&quot;)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Zipped Rasa model </td><td>  * filename - File name of the trained model. <br>  </td></tr>
     * <tr><td> 204 </td><td> The incoming request specified a &#x60;callback_url&#x60; and hence the request will return immediately with an empty response. The actual response will be sent to the provided &#x60;callback_url&#x60; via POST request. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<File> trainModelWithHttpInfo(TrainingRequest trainingRequest, Boolean saveToDefaultModelDirectory, Boolean forceTraining, String callbackUrl) throws ApiException {
        okhttp3.Call localVarCall = trainModelValidateBeforeCall(trainingRequest, saveToDefaultModelDirectory, forceTraining, callbackUrl, null);
        Type localVarReturnType = new TypeToken<File>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Train a Rasa model (asynchronously)
     * Trains a new Rasa model. Depending on the data given only a dialogue model, only a NLU model, or a model combining a trained dialogue model with an NLU model will be trained. The new model is not loaded by default.
     *
     * @param trainingRequest             The training data can either be in YAML format or a JSON which contains Rasa training data in YAML format for each required key. (required)
     * @param saveToDefaultModelDirectory (optional, default to true)
     * @param forceTraining               (optional, default to false)
     * @param callbackUrl                 If specified the call will return immediately with an empty response and status code 204. The actual result or any errors will be sent to the given callback URL as the body of a post request. (optional, default to &quot;None&quot;)
     * @param _callback                   The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Zipped Rasa model </td><td>  * filename - File name of the trained model. <br>  </td></tr>
     * <tr><td> 204 </td><td> The incoming request specified a &#x60;callback_url&#x60; and hence the request will return immediately with an empty response. The actual response will be sent to the provided &#x60;callback_url&#x60; via POST request. </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call trainModelAsync(TrainingRequest trainingRequest, Boolean saveToDefaultModelDirectory, Boolean forceTraining, String callbackUrl, final ApiCallback<File> _callback) throws ApiException {

        okhttp3.Call localVarCall = trainModelValidateBeforeCall(trainingRequest, saveToDefaultModelDirectory, forceTraining, callbackUrl, _callback);
        Type localVarReturnType = new TypeToken<File>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for unloadModel
     *
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Model was sucessfully unloaded. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call unloadModelCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/model";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{"JWT", "TokenAuth"};
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call unloadModelValidateBeforeCall(final ApiCallback _callback) throws ApiException {


        okhttp3.Call localVarCall = unloadModelCall(_callback);
        return localVarCall;

    }

    /**
     * Unload the trained model
     * Unloads the currently loaded trained model from the server.
     *
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Model was sucessfully unloaded. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * </table>
     */
    public void unloadModel() throws ApiException {
        unloadModelWithHttpInfo();
    }

    /**
     * Unload the trained model
     * Unloads the currently loaded trained model from the server.
     *
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Model was sucessfully unloaded. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> unloadModelWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = unloadModelValidateBeforeCall(null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Unload the trained model (asynchronously)
     * Unloads the currently loaded trained model from the server.
     *
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 204 </td><td> Model was sucessfully unloaded. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call unloadModelAsync(final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = unloadModelValidateBeforeCall(_callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
