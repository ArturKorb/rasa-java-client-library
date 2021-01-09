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

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrackerApi {
    private ApiClient localVarApiClient;

    public TrackerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TrackerApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for addConversationMessage
     *
     * @param conversationId Id of the conversation (required)
     * @param message        (required)
     * @param includeEvents  Specify which events of the tracker the response should contain. (optional, default to AFTER_RESTART)
     * @param _callback      Callback for upload/download progress
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
    public okhttp3.Call addConversationMessageCall(String conversationId, Message message, String includeEvents, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = message;

        // create path and map variables
        String localVarPath = "/conversations/{conversation_id}/messages"
                .replaceAll("\\{" + "conversation_id" + "\\}", localVarApiClient.escapeString(conversationId.toString()));

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
    private okhttp3.Call addConversationMessageValidateBeforeCall(String conversationId, Message message, String includeEvents, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'conversationId' is set
        if (conversationId == null) {
            throw new ApiException("Missing the required parameter 'conversationId' when calling addConversationMessage(Async)");
        }

        // verify the required parameter 'message' is set
        if (message == null) {
            throw new ApiException("Missing the required parameter 'message' when calling addConversationMessage(Async)");
        }


        okhttp3.Call localVarCall = addConversationMessageCall(conversationId, message, includeEvents, _callback);
        return localVarCall;

    }

    /**
     * Add a message to a tracker
     * Adds a message to a tracker. This doesn&#39;t trigger the prediction loop. It will log the message on the tracker and return, no actions will be predicted or run. This is often used together with the predict endpoint.
     *
     * @param conversationId Id of the conversation (required)
     * @param message        (required)
     * @param includeEvents  Specify which events of the tracker the response should contain. (optional, default to AFTER_RESTART)
     * @return Tracker
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
    public Tracker addConversationMessage(String conversationId, Message message, String includeEvents) throws ApiException {
        ApiResponse<Tracker> localVarResp = addConversationMessageWithHttpInfo(conversationId, message, includeEvents);
        return localVarResp.getData();
    }

    /**
     * Add a message to a tracker
     * Adds a message to a tracker. This doesn&#39;t trigger the prediction loop. It will log the message on the tracker and return, no actions will be predicted or run. This is often used together with the predict endpoint.
     *
     * @param conversationId Id of the conversation (required)
     * @param message        (required)
     * @param includeEvents  Specify which events of the tracker the response should contain. (optional, default to AFTER_RESTART)
     * @return ApiResponse&lt;Tracker&gt;
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
    public ApiResponse<Tracker> addConversationMessageWithHttpInfo(String conversationId, Message message, String includeEvents) throws ApiException {
        okhttp3.Call localVarCall = addConversationMessageValidateBeforeCall(conversationId, message, includeEvents, null);
        Type localVarReturnType = new TypeToken<Tracker>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add a message to a tracker (asynchronously)
     * Adds a message to a tracker. This doesn&#39;t trigger the prediction loop. It will log the message on the tracker and return, no actions will be predicted or run. This is often used together with the predict endpoint.
     *
     * @param conversationId Id of the conversation (required)
     * @param message        (required)
     * @param includeEvents  Specify which events of the tracker the response should contain. (optional, default to AFTER_RESTART)
     * @param _callback      The callback to be executed when the API call finishes
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
    public okhttp3.Call addConversationMessageAsync(String conversationId, Message message, String includeEvents, final ApiCallback<Tracker> _callback) throws ApiException {

        okhttp3.Call localVarCall = addConversationMessageValidateBeforeCall(conversationId, message, includeEvents, _callback);
        Type localVarReturnType = new TypeToken<Tracker>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for addConversationTrackerEvents
     *
     * @param conversationId     Id of the conversation (required)
     * @param events             (required)
     * @param includeEvents      Specify which events of the tracker the response should contain. (optional, default to AFTER_RESTART)
     * @param outputChannel      The bot&#39;s utterances will be forwarded to this channel. It uses the credentials listed in &#x60;credentials.yml&#x60; to connect. In case the channel does not support this, the utterances will be returned in the response body. Use &#x60;latest&#x60; to try to send the messages to the latest channel the user used. Currently supported channels are listed in the permitted values for the parameter. (optional)
     * @param executeSideEffects (optional, default to false)
     * @param _callback          Callback for upload/download progress
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
    public okhttp3.Call addConversationTrackerEventsCall(String conversationId, Event[] events, String includeEvents, String outputChannel, Boolean executeSideEffects, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = events;

        // create path and map variables
        String localVarPath = "/conversations/{conversation_id}/tracker/events"
                .replaceAll("\\{" + "conversation_id" + "\\}", localVarApiClient.escapeString(conversationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (includeEvents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include_events", includeEvents));
        }

        if (outputChannel != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("output_channel", outputChannel));
        }

        if (executeSideEffects != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("execute_side_effects", executeSideEffects));
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
    private okhttp3.Call addConversationTrackerEventsValidateBeforeCall(String conversationId, Event[] events, String includeEvents, String outputChannel, Boolean executeSideEffects, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'conversationId' is set
        if (conversationId == null) {
            throw new ApiException("Missing the required parameter 'conversationId' when calling addConversationTrackerEvents(Async)");
        }

        // verify the required parameter 'UNKNOWN_BASE_TYPE' is set
        if (events == null) {
            throw new ApiException("Missing the required parameter 'events' when calling addConversationTrackerEvents(Async)");
        }


        okhttp3.Call localVarCall = addConversationTrackerEventsCall(conversationId, events, includeEvents, outputChannel, executeSideEffects, _callback);
        return localVarCall;

    }

    /**
     * Append events to a tracker
     * Appends one or multiple new events to the tracker state of the conversation. Any existing events will be kept and the new events will be appended, updating the existing state. If events are appended to a new conversation ID, the tracker will be initialised with a new session.
     *
     * @param conversationId     Id of the conversation (required)
     * @param events             (required)
     * @param includeEvents      Specify which events of the tracker the response should contain. (optional, default to AFTER_RESTART)
     * @param outputChannel      The bot&#39;s utterances will be forwarded to this channel. It uses the credentials listed in &#x60;credentials.yml&#x60; to connect. In case the channel does not support this, the utterances will be returned in the response body. Use &#x60;latest&#x60; to try to send the messages to the latest channel the user used. Currently supported channels are listed in the permitted values for the parameter. (optional)
     * @param executeSideEffects (optional, default to false)
     * @return Tracker
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
    public Tracker addConversationTrackerEvents(String conversationId, Event[] events, String includeEvents, String outputChannel, Boolean executeSideEffects) throws ApiException {
        ApiResponse<Tracker> localVarResp = addConversationTrackerEventsWithHttpInfo(conversationId, events, includeEvents, outputChannel, executeSideEffects);
        return localVarResp.getData();
    }

    /**
     * Append events to a tracker
     * Appends one or multiple new events to the tracker state of the conversation. Any existing events will be kept and the new events will be appended, updating the existing state. If events are appended to a new conversation ID, the tracker will be initialised with a new session.
     *
     * @param conversationId     Id of the conversation (required)
     * @param events             (required)
     * @param includeEvents      Specify which events of the tracker the response should contain. (optional, default to AFTER_RESTART)
     * @param outputChannel      The bot&#39;s utterances will be forwarded to this channel. It uses the credentials listed in &#x60;credentials.yml&#x60; to connect. In case the channel does not support this, the utterances will be returned in the response body. Use &#x60;latest&#x60; to try to send the messages to the latest channel the user used. Currently supported channels are listed in the permitted values for the parameter. (optional)
     * @param executeSideEffects (optional, default to false)
     * @return ApiResponse&lt;Tracker&gt;
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
    public ApiResponse<Tracker> addConversationTrackerEventsWithHttpInfo(String conversationId, Event[] events, String includeEvents, String outputChannel, Boolean executeSideEffects) throws ApiException {
        okhttp3.Call localVarCall = addConversationTrackerEventsValidateBeforeCall(conversationId, events, includeEvents, outputChannel, executeSideEffects, null);
        Type localVarReturnType = new TypeToken<Tracker>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Append events to a tracker (asynchronously)
     * Appends one or multiple new events to the tracker state of the conversation. Any existing events will be kept and the new events will be appended, updating the existing state. If events are appended to a new conversation ID, the tracker will be initialised with a new session.
     *
     * @param conversationId     Id of the conversation (required)
     * @param events             (required)
     * @param includeEvents      Specify which events of the tracker the response should contain. (optional, default to AFTER_RESTART)
     * @param outputChannel      The bot&#39;s utterances will be forwarded to this channel. It uses the credentials listed in &#x60;credentials.yml&#x60; to connect. In case the channel does not support this, the utterances will be returned in the response body. Use &#x60;latest&#x60; to try to send the messages to the latest channel the user used. Currently supported channels are listed in the permitted values for the parameter. (optional)
     * @param executeSideEffects (optional, default to false)
     * @param _callback          The callback to be executed when the API call finishes
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
    public okhttp3.Call addConversationTrackerEventsAsync(String conversationId, Event[] events, String includeEvents, String outputChannel, Boolean executeSideEffects, final ApiCallback<Tracker> _callback) throws ApiException {

        okhttp3.Call localVarCall = addConversationTrackerEventsValidateBeforeCall(conversationId, events, includeEvents, outputChannel, executeSideEffects, _callback);
        Type localVarReturnType = new TypeToken<Tracker>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for executeConversationAction
     *
     * @param conversationId Id of the conversation (required)
     * @param actionRequest  (required)
     * @param includeEvents  Specify which events of the tracker the response should contain. (optional, default to AFTER_RESTART)
     * @param outputChannel  The bot&#39;s utterances will be forwarded to this channel. It uses the credentials listed in &#x60;credentials.yml&#x60; to connect. In case the channel does not support this, the utterances will be returned in the response body. Use &#x60;latest&#x60; to try to send the messages to the latest channel the user used. Currently supported channels are listed in the permitted values for the parameter. (optional)
     * @param _callback      Callback for upload/download progress
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
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call executeConversationActionCall(String conversationId, ActionRequest actionRequest, String includeEvents, String outputChannel, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = actionRequest;

        // create path and map variables
        String localVarPath = "/conversations/{conversation_id}/execute"
                .replaceAll("\\{" + "conversation_id" + "\\}", localVarApiClient.escapeString(conversationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (includeEvents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include_events", includeEvents));
        }

        if (outputChannel != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("output_channel", outputChannel));
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

    @Deprecated
    @SuppressWarnings("rawtypes")
    private okhttp3.Call executeConversationActionValidateBeforeCall(String conversationId, ActionRequest actionRequest, String includeEvents, String outputChannel, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'conversationId' is set
        if (conversationId == null) {
            throw new ApiException("Missing the required parameter 'conversationId' when calling executeConversationAction(Async)");
        }

        // verify the required parameter 'actionRequest' is set
        if (actionRequest == null) {
            throw new ApiException("Missing the required parameter 'actionRequest' when calling executeConversationAction(Async)");
        }


        okhttp3.Call localVarCall = executeConversationActionCall(conversationId, actionRequest, includeEvents, outputChannel, _callback);
        return localVarCall;

    }

    /**
     * Run an action in a conversation
     * DEPRECATED. Runs the action, calling the action server if necessary. Any responses sent by the executed action will be forwarded to the channel specified in the output_channel parameter. If no output channel is specified, any messages that should be sent to the user will be included in the response of this endpoint.
     *
     * @param conversationId Id of the conversation (required)
     * @param actionRequest  (required)
     * @param includeEvents  Specify which events of the tracker the response should contain. (optional, default to AFTER_RESTART)
     * @param outputChannel  The bot&#39;s utterances will be forwarded to this channel. It uses the credentials listed in &#x60;credentials.yml&#x60; to connect. In case the channel does not support this, the utterances will be returned in the response body. Use &#x60;latest&#x60; to try to send the messages to the latest channel the user used. Currently supported channels are listed in the permitted values for the parameter. (optional)
     * @return InlineResponse2002
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
     * @deprecated
     */
    @Deprecated
    public InlineResponse202 executeConversationAction(String conversationId, ActionRequest actionRequest, String includeEvents, String outputChannel) throws ApiException {
        ApiResponse<InlineResponse202> localVarResp = executeConversationActionWithHttpInfo(conversationId, actionRequest, includeEvents, outputChannel);
        return localVarResp.getData();
    }

    /**
     * Run an action in a conversation
     * DEPRECATED. Runs the action, calling the action server if necessary. Any responses sent by the executed action will be forwarded to the channel specified in the output_channel parameter. If no output channel is specified, any messages that should be sent to the user will be included in the response of this endpoint.
     *
     * @param conversationId Id of the conversation (required)
     * @param actionRequest  (required)
     * @param includeEvents  Specify which events of the tracker the response should contain. (optional, default to AFTER_RESTART)
     * @param outputChannel  The bot&#39;s utterances will be forwarded to this channel. It uses the credentials listed in &#x60;credentials.yml&#x60; to connect. In case the channel does not support this, the utterances will be returned in the response body. Use &#x60;latest&#x60; to try to send the messages to the latest channel the user used. Currently supported channels are listed in the permitted values for the parameter. (optional)
     * @return ApiResponse&lt;InlineResponse2002&gt;
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
     * @deprecated
     */
    @Deprecated
    public ApiResponse<InlineResponse202> executeConversationActionWithHttpInfo(String conversationId, ActionRequest actionRequest, String includeEvents, String outputChannel) throws ApiException {
        okhttp3.Call localVarCall = executeConversationActionValidateBeforeCall(conversationId, actionRequest, includeEvents, outputChannel, null);
        Type localVarReturnType = new TypeToken<InlineResponse202>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Run an action in a conversation (asynchronously)
     * DEPRECATED. Runs the action, calling the action server if necessary. Any responses sent by the executed action will be forwarded to the channel specified in the output_channel parameter. If no output channel is specified, any messages that should be sent to the user will be included in the response of this endpoint.
     *
     * @param conversationId Id of the conversation (required)
     * @param actionRequest  (required)
     * @param includeEvents  Specify which events of the tracker the response should contain. (optional, default to AFTER_RESTART)
     * @param outputChannel  The bot&#39;s utterances will be forwarded to this channel. It uses the credentials listed in &#x60;credentials.yml&#x60; to connect. In case the channel does not support this, the utterances will be returned in the response body. Use &#x60;latest&#x60; to try to send the messages to the latest channel the user used. Currently supported channels are listed in the permitted values for the parameter. (optional)
     * @param _callback      The callback to be executed when the API call finishes
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
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call executeConversationActionAsync(String conversationId, ActionRequest actionRequest, String includeEvents, String outputChannel, final ApiCallback<InlineResponse202> _callback) throws ApiException {

        okhttp3.Call localVarCall = executeConversationActionValidateBeforeCall(conversationId, actionRequest, includeEvents, outputChannel, _callback);
        Type localVarReturnType = new TypeToken<InlineResponse202>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getConversationStory
     *
     * @param conversationId Id of the conversation (required)
     * @param until          All events previous to the passed timestamp will be replayed. Events that occur exactly at the target time will be included. (optional)
     * @param allSessions    Fetch test stories for all conversation sessions (optional, default to false)
     * @param _callback      Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The request conflicts with the currently loaded model. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getConversationStoryCall(String conversationId, BigDecimal until, Boolean allSessions, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/conversations/{conversation_id}/story"
                .replaceAll("\\{" + "conversation_id" + "\\}", localVarApiClient.escapeString(conversationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (until != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("until", until));
        }

        if (allSessions != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("all_sessions", allSessions));
        }

        final String[] localVarAccepts = {
                "text/yml", "application/json"
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
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getConversationStoryValidateBeforeCall(String conversationId, BigDecimal until, Boolean allSessions, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'conversationId' is set
        if (conversationId == null) {
            throw new ApiException("Missing the required parameter 'conversationId' when calling getConversationStory(Async)");
        }


        okhttp3.Call localVarCall = getConversationStoryCall(conversationId, until, allSessions, _callback);
        return localVarCall;

    }

    /**
     * Retrieve an end-to-end story corresponding to a conversation
     * The story represents the whole conversation in end-to-end format. This can be posted to the &#39;/test/stories&#39; endpoint and used as a test.
     *
     * @param conversationId Id of the conversation (required)
     * @param until          All events previous to the passed timestamp will be replayed. Events that occur exactly at the target time will be included. (optional)
     * @param allSessions    Fetch test stories for all conversation sessions (optional, default to false)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The request conflicts with the currently loaded model. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public void getConversationStory(String conversationId, BigDecimal until, Boolean allSessions) throws ApiException {
        getConversationStoryWithHttpInfo(conversationId, until, allSessions);
    }

    /**
     * Retrieve an end-to-end story corresponding to a conversation
     * The story represents the whole conversation in end-to-end format. This can be posted to the &#39;/test/stories&#39; endpoint and used as a test.
     *
     * @param conversationId Id of the conversation (required)
     * @param until          All events previous to the passed timestamp will be replayed. Events that occur exactly at the target time will be included. (optional)
     * @param allSessions    Fetch test stories for all conversation sessions (optional, default to false)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The request conflicts with the currently loaded model. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Void> getConversationStoryWithHttpInfo(String conversationId, BigDecimal until, Boolean allSessions) throws ApiException {
        okhttp3.Call localVarCall = getConversationStoryValidateBeforeCall(conversationId, until, allSessions, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Retrieve an end-to-end story corresponding to a conversation (asynchronously)
     * The story represents the whole conversation in end-to-end format. This can be posted to the &#39;/test/stories&#39; endpoint and used as a test.
     *
     * @param conversationId Id of the conversation (required)
     * @param until          All events previous to the passed timestamp will be replayed. Events that occur exactly at the target time will be included. (optional)
     * @param allSessions    Fetch test stories for all conversation sessions (optional, default to false)
     * @param _callback      The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The request conflicts with the currently loaded model. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getConversationStoryAsync(String conversationId, BigDecimal until, Boolean allSessions, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = getConversationStoryValidateBeforeCall(conversationId, until, allSessions, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    /**
     * Build call for getConversationTracker
     *
     * @param conversationId Id of the conversation (required)
     * @param includeEvents  Specify which events of the tracker the response should contain. (optional, default to AFTER_RESTART)
     * @param until          All events previous to the passed timestamp will be replayed. Events that occur exactly at the target time will be included. (optional)
     * @param _callback      Callback for upload/download progress
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
    public okhttp3.Call getConversationTrackerCall(String conversationId, String includeEvents, BigDecimal until, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/conversations/{conversation_id}/tracker"
                .replaceAll("\\{" + "conversation_id" + "\\}", localVarApiClient.escapeString(conversationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (includeEvents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include_events", includeEvents));
        }

        if (until != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("until", until));
        }

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
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getConversationTrackerValidateBeforeCall(String conversationId, String includeEvents, BigDecimal until, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'conversationId' is set
        if (conversationId == null) {
            throw new ApiException("Missing the required parameter 'conversationId' when calling getConversationTracker(Async)");
        }


        okhttp3.Call localVarCall = getConversationTrackerCall(conversationId, includeEvents, until, _callback);
        return localVarCall;

    }

    /**
     * Retrieve a conversations tracker
     * The tracker represents the state of the conversation. The state of the tracker is created by applying a sequence of events, which modify the state. These events can optionally be included in the response.
     *
     * @param conversationId Id of the conversation (required)
     * @param includeEvents  Specify which events of the tracker the response should contain. (optional, default to AFTER_RESTART)
     * @param until          All events previous to the passed timestamp will be replayed. Events that occur exactly at the target time will be included. (optional)
     * @return Tracker
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
    public Tracker getConversationTracker(String conversationId, String includeEvents, BigDecimal until) throws ApiException {
        ApiResponse<Tracker> localVarResp = getConversationTrackerWithHttpInfo(conversationId, includeEvents, until);
        return localVarResp.getData();
    }

    /**
     * Retrieve a conversations tracker
     * The tracker represents the state of the conversation. The state of the tracker is created by applying a sequence of events, which modify the state. These events can optionally be included in the response.
     *
     * @param conversationId Id of the conversation (required)
     * @param includeEvents  Specify which events of the tracker the response should contain. (optional, default to AFTER_RESTART)
     * @param until          All events previous to the passed timestamp will be replayed. Events that occur exactly at the target time will be included. (optional)
     * @return ApiResponse&lt;Tracker&gt;
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
    public ApiResponse<Tracker> getConversationTrackerWithHttpInfo(String conversationId, String includeEvents, BigDecimal until) throws ApiException {
        okhttp3.Call localVarCall = getConversationTrackerValidateBeforeCall(conversationId, includeEvents, until, null);
        Type localVarReturnType = new TypeToken<Tracker>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve a conversations tracker (asynchronously)
     * The tracker represents the state of the conversation. The state of the tracker is created by applying a sequence of events, which modify the state. These events can optionally be included in the response.
     *
     * @param conversationId Id of the conversation (required)
     * @param includeEvents  Specify which events of the tracker the response should contain. (optional, default to AFTER_RESTART)
     * @param until          All events previous to the passed timestamp will be replayed. Events that occur exactly at the target time will be included. (optional)
     * @param _callback      The callback to be executed when the API call finishes
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
    public okhttp3.Call getConversationTrackerAsync(String conversationId, String includeEvents, BigDecimal until, final ApiCallback<Tracker> _callback) throws ApiException {

        okhttp3.Call localVarCall = getConversationTrackerValidateBeforeCall(conversationId, includeEvents, until, _callback);
        Type localVarReturnType = new TypeToken<Tracker>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for predictConversationAction
     *
     * @param conversationId Id of the conversation (required)
     * @param _callback      Callback for upload/download progress
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
    public okhttp3.Call predictConversationActionCall(String conversationId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/conversations/{conversation_id}/predict"
                .replaceAll("\\{" + "conversation_id" + "\\}", localVarApiClient.escapeString(conversationId.toString()));

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
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call predictConversationActionValidateBeforeCall(String conversationId, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'conversationId' is set
        if (conversationId == null) {
            throw new ApiException("Missing the required parameter 'conversationId' when calling predictConversationAction(Async)");
        }


        okhttp3.Call localVarCall = predictConversationActionCall(conversationId, _callback);
        return localVarCall;

    }

    /**
     * Predict the next action
     * Runs the conversations tracker through the model&#39;s policies to predict the scores of all actions present in the model&#39;s domain. Actions are returned in the &#39;scores&#39; array, sorted on their &#39;score&#39; values. The state of the tracker is not modified.
     *
     * @param conversationId Id of the conversation (required)
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
    public PredictResult predictConversationAction(String conversationId) throws ApiException {
        ApiResponse<PredictResult> localVarResp = predictConversationActionWithHttpInfo(conversationId);
        return localVarResp.getData();
    }

    /**
     * Predict the next action
     * Runs the conversations tracker through the model&#39;s policies to predict the scores of all actions present in the model&#39;s domain. Actions are returned in the &#39;scores&#39; array, sorted on their &#39;score&#39; values. The state of the tracker is not modified.
     *
     * @param conversationId Id of the conversation (required)
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
    public ApiResponse<PredictResult> predictConversationActionWithHttpInfo(String conversationId) throws ApiException {
        okhttp3.Call localVarCall = predictConversationActionValidateBeforeCall(conversationId, null);
        Type localVarReturnType = new TypeToken<PredictResult>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Predict the next action (asynchronously)
     * Runs the conversations tracker through the model&#39;s policies to predict the scores of all actions present in the model&#39;s domain. Actions are returned in the &#39;scores&#39; array, sorted on their &#39;score&#39; values. The state of the tracker is not modified.
     *
     * @param conversationId Id of the conversation (required)
     * @param _callback      The callback to be executed when the API call finishes
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
    public okhttp3.Call predictConversationActionAsync(String conversationId, final ApiCallback<PredictResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = predictConversationActionValidateBeforeCall(conversationId, _callback);
        Type localVarReturnType = new TypeToken<PredictResult>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for replaceConversationTrackerEvents
     *
     * @param conversationId Id of the conversation (required)
     * @param event          (required)
     * @param includeEvents  Specify which events of the tracker the response should contain. (optional, default to AFTER_RESTART)
     * @param _callback      Callback for upload/download progress
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
    public okhttp3.Call replaceConversationTrackerEventsCall(String conversationId, List<Event> event, String includeEvents, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = event;

        // create path and map variables
        String localVarPath = "/conversations/{conversation_id}/tracker/events"
                .replaceAll("\\{" + "conversation_id" + "\\}", localVarApiClient.escapeString(conversationId.toString()));

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
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call replaceConversationTrackerEventsValidateBeforeCall(String conversationId, List<Event> event, String includeEvents, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'conversationId' is set
        if (conversationId == null) {
            throw new ApiException("Missing the required parameter 'conversationId' when calling replaceConversationTrackerEvents(Async)");
        }

        // verify the required parameter 'event' is set
        if (event == null) {
            throw new ApiException("Missing the required parameter 'event' when calling replaceConversationTrackerEvents(Async)");
        }


        okhttp3.Call localVarCall = replaceConversationTrackerEventsCall(conversationId, event, includeEvents, _callback);
        return localVarCall;

    }

    /**
     * Replace a trackers events
     * Replaces all events of a tracker with the passed list of events. This endpoint should not be used to modify trackers in a production setup, but rather for creating training data.
     *
     * @param conversationId Id of the conversation (required)
     * @param event          (required)
     * @param includeEvents  Specify which events of the tracker the response should contain. (optional, default to AFTER_RESTART)
     * @return Tracker
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
    public Tracker replaceConversationTrackerEvents(String conversationId, List<Event> event, String includeEvents) throws ApiException {
        ApiResponse<Tracker> localVarResp = replaceConversationTrackerEventsWithHttpInfo(conversationId, event, includeEvents);
        return localVarResp.getData();
    }

    /**
     * Replace a trackers events
     * Replaces all events of a tracker with the passed list of events. This endpoint should not be used to modify trackers in a production setup, but rather for creating training data.
     *
     * @param conversationId Id of the conversation (required)
     * @param event          (required)
     * @param includeEvents  Specify which events of the tracker the response should contain. (optional, default to AFTER_RESTART)
     * @return ApiResponse&lt;Tracker&gt;
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
    public ApiResponse<Tracker> replaceConversationTrackerEventsWithHttpInfo(String conversationId, List<Event> event, String includeEvents) throws ApiException {
        okhttp3.Call localVarCall = replaceConversationTrackerEventsValidateBeforeCall(conversationId, event, includeEvents, null);
        Type localVarReturnType = new TypeToken<Tracker>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Replace a trackers events (asynchronously)
     * Replaces all events of a tracker with the passed list of events. This endpoint should not be used to modify trackers in a production setup, but rather for creating training data.
     *
     * @param conversationId Id of the conversation (required)
     * @param event          (required)
     * @param includeEvents  Specify which events of the tracker the response should contain. (optional, default to AFTER_RESTART)
     * @param _callback      The callback to be executed when the API call finishes
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
    public okhttp3.Call replaceConversationTrackerEventsAsync(String conversationId, List<Event> event, String includeEvents, final ApiCallback<Tracker> _callback) throws ApiException {

        okhttp3.Call localVarCall = replaceConversationTrackerEventsValidateBeforeCall(conversationId, event, includeEvents, _callback);
        Type localVarReturnType = new TypeToken<Tracker>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for triggerConversationIntent
     *
     * @param conversationId       Id of the conversation (required)
     * @param intentTriggerRequest (required)
     * @param includeEvents        Specify which events of the tracker the response should contain. (optional, default to AFTER_RESTART)
     * @param outputChannel        The bot&#39;s utterances will be forwarded to this channel. It uses the credentials listed in &#x60;credentials.yml&#x60; to connect. In case the channel does not support this, the utterances will be returned in the response body. Use &#x60;latest&#x60; to try to send the messages to the latest channel the user used. Currently supported channels are listed in the permitted values for the parameter. (optional)
     * @param _callback            Callback for upload/download progress
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
    public okhttp3.Call triggerConversationIntentCall(String conversationId, IntentTriggerRequest intentTriggerRequest, String includeEvents, String outputChannel, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = intentTriggerRequest;

        // create path and map variables
        String localVarPath = "/conversations/{conversation_id}/trigger_intent"
                .replaceAll("\\{" + "conversation_id" + "\\}", localVarApiClient.escapeString(conversationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (includeEvents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include_events", includeEvents));
        }

        if (outputChannel != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("output_channel", outputChannel));
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
    private okhttp3.Call triggerConversationIntentValidateBeforeCall(String conversationId, IntentTriggerRequest intentTriggerRequest, String includeEvents, String outputChannel, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'conversationId' is set
        if (conversationId == null) {
            throw new ApiException("Missing the required parameter 'conversationId' when calling triggerConversationIntent(Async)");
        }

        // verify the required parameter 'intentTriggerRequest' is set
        if (intentTriggerRequest == null) {
            throw new ApiException("Missing the required parameter 'intentTriggerRequest' when calling triggerConversationIntent(Async)");
        }


        okhttp3.Call localVarCall = triggerConversationIntentCall(conversationId, intentTriggerRequest, includeEvents, outputChannel, _callback);
        return localVarCall;

    }

    /**
     * Inject an intent into a conversation
     * Sends a specified intent and list of entities in place of a user message. The bot then predicts and executes a response action. Any responses sent by the executed action will be forwarded to the channel specified in the &#x60;&#x60;output_channel&#x60;&#x60; parameter. If no output channel is specified, any messages that should be sent to the user will be included in the response of this endpoint.
     *
     * @param conversationId       Id of the conversation (required)
     * @param intentTriggerRequest (required)
     * @param includeEvents        Specify which events of the tracker the response should contain. (optional, default to AFTER_RESTART)
     * @param outputChannel        The bot&#39;s utterances will be forwarded to this channel. It uses the credentials listed in &#x60;credentials.yml&#x60; to connect. In case the channel does not support this, the utterances will be returned in the response body. Use &#x60;latest&#x60; to try to send the messages to the latest channel the user used. Currently supported channels are listed in the permitted values for the parameter. (optional)
     * @return InlineResponse2002
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
    public InlineResponse202 triggerConversationIntent(String conversationId, IntentTriggerRequest intentTriggerRequest, String includeEvents, String outputChannel) throws ApiException {
        ApiResponse<InlineResponse202> localVarResp = triggerConversationIntentWithHttpInfo(conversationId, intentTriggerRequest, includeEvents, outputChannel);
        return localVarResp.getData();
    }

    /**
     * Inject an intent into a conversation
     * Sends a specified intent and list of entities in place of a user message. The bot then predicts and executes a response action. Any responses sent by the executed action will be forwarded to the channel specified in the &#x60;&#x60;output_channel&#x60;&#x60; parameter. If no output channel is specified, any messages that should be sent to the user will be included in the response of this endpoint.
     *
     * @param conversationId       Id of the conversation (required)
     * @param intentTriggerRequest (required)
     * @param includeEvents        Specify which events of the tracker the response should contain. (optional, default to AFTER_RESTART)
     * @param outputChannel        The bot&#39;s utterances will be forwarded to this channel. It uses the credentials listed in &#x60;credentials.yml&#x60; to connect. In case the channel does not support this, the utterances will be returned in the response body. Use &#x60;latest&#x60; to try to send the messages to the latest channel the user used. Currently supported channels are listed in the permitted values for the parameter. (optional)
     * @return ApiResponse&lt;InlineResponse2002&gt;
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
    public ApiResponse<InlineResponse202> triggerConversationIntentWithHttpInfo(String conversationId, IntentTriggerRequest intentTriggerRequest, String includeEvents, String outputChannel) throws ApiException {
        okhttp3.Call localVarCall = triggerConversationIntentValidateBeforeCall(conversationId, intentTriggerRequest, includeEvents, outputChannel, null);
        Type localVarReturnType = new TypeToken<InlineResponse202>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Inject an intent into a conversation (asynchronously)
     * Sends a specified intent and list of entities in place of a user message. The bot then predicts and executes a response action. Any responses sent by the executed action will be forwarded to the channel specified in the &#x60;&#x60;output_channel&#x60;&#x60; parameter. If no output channel is specified, any messages that should be sent to the user will be included in the response of this endpoint.
     *
     * @param conversationId       Id of the conversation (required)
     * @param intentTriggerRequest (required)
     * @param includeEvents        Specify which events of the tracker the response should contain. (optional, default to AFTER_RESTART)
     * @param outputChannel        The bot&#39;s utterances will be forwarded to this channel. It uses the credentials listed in &#x60;credentials.yml&#x60; to connect. In case the channel does not support this, the utterances will be returned in the response body. Use &#x60;latest&#x60; to try to send the messages to the latest channel the user used. Currently supported channels are listed in the permitted values for the parameter. (optional)
     * @param _callback            The callback to be executed when the API call finishes
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
    public okhttp3.Call triggerConversationIntentAsync(String conversationId, IntentTriggerRequest intentTriggerRequest, String includeEvents, String outputChannel, final ApiCallback<InlineResponse202> _callback) throws ApiException {

        okhttp3.Call localVarCall = triggerConversationIntentValidateBeforeCall(conversationId, intentTriggerRequest, includeEvents, outputChannel, _callback);
        Type localVarReturnType = new TypeToken<InlineResponse202>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
