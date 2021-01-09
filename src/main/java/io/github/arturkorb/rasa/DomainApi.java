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
import io.github.arturkorb.rasa.model.Domain;
import io.github.arturkorb.utils.ApiCallback;
import io.github.arturkorb.utils.ApiException;
import io.github.arturkorb.utils.ApiResponse;
import io.github.arturkorb.utils.Pair;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DomainApi {
    private ApiClient localVarApiClient;

    public DomainApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DomainApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getDomain
     *
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Domain was successfully retrieved. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 406 </td><td> Invalid header provided. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getDomainCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/domain";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json", "application/yaml"
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
    private okhttp3.Call getDomainValidateBeforeCall(final ApiCallback _callback) throws ApiException {


        okhttp3.Call localVarCall = getDomainCall(_callback);
        return localVarCall;

    }

    /**
     * Retrieve the loaded domain
     * Returns the domain specification the currently loaded model is using.
     *
     * @return Domain
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Domain was successfully retrieved. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 406 </td><td> Invalid header provided. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public Domain getDomain() throws ApiException {
        ApiResponse<Domain> localVarResp = getDomainWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Retrieve the loaded domain
     * Returns the domain specification the currently loaded model is using.
     *
     * @return ApiResponse&lt;Domain&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Domain was successfully retrieved. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 406 </td><td> Invalid header provided. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Domain> getDomainWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getDomainValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Domain>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve the loaded domain (asynchronously)
     * Returns the domain specification the currently loaded model is using.
     *
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Domain was successfully retrieved. </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> User is not authenticated. </td><td>  -  </td></tr>
     * <tr><td> 403 </td><td> User has insufficient permission. </td><td>  -  </td></tr>
     * <tr><td> 406 </td><td> Invalid header provided. </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getDomainAsync(final ApiCallback<Domain> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDomainValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Domain>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
