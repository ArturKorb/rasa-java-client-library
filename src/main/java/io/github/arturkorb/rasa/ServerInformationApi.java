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
import io.github.arturkorb.rasa.model.InlineResponse200;
import io.github.arturkorb.rasa.model.InlineResponse201;
import io.github.arturkorb.utils.ApiCallback;
import io.github.arturkorb.utils.ApiException;
import io.github.arturkorb.utils.ApiResponse;
import io.github.arturkorb.utils.Pair;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServerInformationApi {
    private ApiClient localVarApiClient;

    public ServerInformationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ServerInformationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getHealth
     *
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Up and running </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getHealthCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{};
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getHealthValidateBeforeCall(final ApiCallback _callback) throws ApiException {


        okhttp3.Call localVarCall = getHealthCall(_callback);
        return localVarCall;

    }

    /**
     * Health endpoint of Rasa Server
     * This URL can be used as an endpoint to run health checks against. When the server is running this will return 200.
     *
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Up and running </td><td>  -  </td></tr>
     * </table>
     */
    public String getHealth() throws ApiException {
        ApiResponse<String> localVarResp = getHealthWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Health endpoint of Rasa Server
     * This URL can be used as an endpoint to run health checks against. When the server is running this will return 200.
     *
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Up and running </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<String> getHealthWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getHealthValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<String>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Health endpoint of Rasa Server (asynchronously)
     * This URL can be used as an endpoint to run health checks against. When the server is running this will return 200.
     *
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Up and running </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getHealthAsync(final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = getHealthValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<String>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getStatus
     *
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The request conflicts with the currently loaded model. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getStatusCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/status";

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
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getStatusValidateBeforeCall(final ApiCallback _callback) throws ApiException {


        okhttp3.Call localVarCall = getStatusCall(_callback);
        return localVarCall;

    }

    /**
     * Status of the Rasa server
     * Information about the server and the currently loaded Rasa model.
     *
     * @return InlineResponse2001
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The request conflicts with the currently loaded model. </td><td>  -  </td></tr>
     * </table>
     */
    public InlineResponse201 getStatus() throws ApiException {
        ApiResponse<InlineResponse201> localVarResp = getStatusWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Status of the Rasa server
     * Information about the server and the currently loaded Rasa model.
     *
     * @return ApiResponse&lt;InlineResponse2001&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The request conflicts with the currently loaded model. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<InlineResponse201> getStatusWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getStatusValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<InlineResponse201>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Status of the Rasa server (asynchronously)
     * Information about the server and the currently loaded Rasa model.
     *
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The request conflicts with the currently loaded model. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getStatusAsync(final ApiCallback<InlineResponse201> _callback) throws ApiException {

        okhttp3.Call localVarCall = getStatusValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<InlineResponse201>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getVersion
     *
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Version of Rasa </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getVersionCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/version";

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

        String[] localVarAuthNames = new String[]{};
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getVersionValidateBeforeCall(final ApiCallback _callback) throws ApiException {


        okhttp3.Call localVarCall = getVersionCall(_callback);
        return localVarCall;

    }

    /**
     * Version of Rasa
     * Returns the version of Rasa.
     *
     * @return InlineResponse200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Version of Rasa </td><td>  -  </td></tr>
     * </table>
     */
    public InlineResponse200 getVersion() throws ApiException {
        ApiResponse<InlineResponse200> localVarResp = getVersionWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Version of Rasa
     * Returns the version of Rasa.
     *
     * @return ApiResponse&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Version of Rasa </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<InlineResponse200> getVersionWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getVersionValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<InlineResponse200>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Version of Rasa (asynchronously)
     * Returns the version of Rasa.
     *
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Version of Rasa </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getVersionAsync(final ApiCallback<InlineResponse200> _callback) throws ApiException {

        okhttp3.Call localVarCall = getVersionValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<InlineResponse200>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
