package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * EndpointConfig
 */

public class EndpointConfig {
    public static final String SERIALIZED_NAME_URL = "url";
    @SerializedName(SERIALIZED_NAME_URL)
    private String url;

    public static final String SERIALIZED_NAME_PARAMS = "params";
    @SerializedName(SERIALIZED_NAME_PARAMS)
    private Object params;

    public static final String SERIALIZED_NAME_HEADERS = "headers";
    @SerializedName(SERIALIZED_NAME_HEADERS)
    private Object headers;

    public static final String SERIALIZED_NAME_BASIC_AUTH = "basic_auth";
    @SerializedName(SERIALIZED_NAME_BASIC_AUTH)
    private Object basicAuth;

    public static final String SERIALIZED_NAME_TOKEN = "token";
    @SerializedName(SERIALIZED_NAME_TOKEN)
    private String token;

    public static final String SERIALIZED_NAME_TOKEN_NAME = "token_name";
    @SerializedName(SERIALIZED_NAME_TOKEN_NAME)
    private String tokenName;

    public static final String SERIALIZED_NAME_WAIT_TIME_BETWEEN_PULLS = "wait_time_between_pulls";
    @SerializedName(SERIALIZED_NAME_WAIT_TIME_BETWEEN_PULLS)
    private Integer waitTimeBetweenPulls;


    public EndpointConfig url(String url) {

        this.url = url;
        return this;
    }

    /**
     * URL pointing to model
     *
     * @return url
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "URL pointing to model")

    public String getUrl() {
        return url;
    }


    public void setUrl(String url) {
        this.url = url;
    }


    public EndpointConfig params(Object params) {

        this.params = params;
        return this;
    }

    /**
     * Parameters of request
     *
     * @return params
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Parameters of request")

    public Object getParams() {
        return params;
    }


    public void setParams(Object params) {
        this.params = params;
    }


    public EndpointConfig headers(Object headers) {

        this.headers = headers;
        return this;
    }

    /**
     * HTTP headers
     *
     * @return headers
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "HTTP headers")

    public Object getHeaders() {
        return headers;
    }


    public void setHeaders(Object headers) {
        this.headers = headers;
    }


    public EndpointConfig basicAuth(Object basicAuth) {

        this.basicAuth = basicAuth;
        return this;
    }

    /**
     * Basic authentification data
     *
     * @return basicAuth
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Basic authentification data")

    public Object getBasicAuth() {
        return basicAuth;
    }


    public void setBasicAuth(Object basicAuth) {
        this.basicAuth = basicAuth;
    }


    public EndpointConfig token(String token) {

        this.token = token;
        return this;
    }

    /**
     * Token
     *
     * @return token
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Token")

    public String getToken() {
        return token;
    }


    public void setToken(String token) {
        this.token = token;
    }


    public EndpointConfig tokenName(String tokenName) {

        this.tokenName = tokenName;
        return this;
    }

    /**
     * Name of token
     *
     * @return tokenName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Name of token")

    public String getTokenName() {
        return tokenName;
    }


    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }


    public EndpointConfig waitTimeBetweenPulls(Integer waitTimeBetweenPulls) {

        this.waitTimeBetweenPulls = waitTimeBetweenPulls;
        return this;
    }

    /**
     * Time to wait between pulls from model server
     *
     * @return waitTimeBetweenPulls
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Time to wait between pulls from model server")

    public Integer getWaitTimeBetweenPulls() {
        return waitTimeBetweenPulls;
    }


    public void setWaitTimeBetweenPulls(Integer waitTimeBetweenPulls) {
        this.waitTimeBetweenPulls = waitTimeBetweenPulls;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EndpointConfig endpointConfig = (EndpointConfig) o;
        return Objects.equals(this.url, endpointConfig.url) &&
                Objects.equals(this.params, endpointConfig.params) &&
                Objects.equals(this.headers, endpointConfig.headers) &&
                Objects.equals(this.basicAuth, endpointConfig.basicAuth) &&
                Objects.equals(this.token, endpointConfig.token) &&
                Objects.equals(this.tokenName, endpointConfig.tokenName) &&
                Objects.equals(this.waitTimeBetweenPulls, endpointConfig.waitTimeBetweenPulls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, params, headers, basicAuth, token, tokenName, waitTimeBetweenPulls);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EndpointConfig {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
        sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    tokenName: ").append(toIndentedString(tokenName)).append("\n");
        sb.append("    waitTimeBetweenPulls: ").append(toIndentedString(waitTimeBetweenPulls)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

