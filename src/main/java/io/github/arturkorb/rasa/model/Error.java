package io.github.arturkorb.rasa.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Error
 */

public class Error {
    public static final String SERIALIZED_NAME_VERSION = "version";
    @SerializedName(SERIALIZED_NAME_VERSION)
    private String version;

    /**
     * Status of the requested action
     */
    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
        FAILURE("failure");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<StatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StatusEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StatusEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_STATUS = "status";
    @SerializedName(SERIALIZED_NAME_STATUS)
    private StatusEnum status;

    public static final String SERIALIZED_NAME_MESSAGE = "message";
    @SerializedName(SERIALIZED_NAME_MESSAGE)
    private String message;

    public static final String SERIALIZED_NAME_REASON = "reason";
    @SerializedName(SERIALIZED_NAME_REASON)
    private String reason;

    public static final String SERIALIZED_NAME_DETAILS = "details";
    @SerializedName(SERIALIZED_NAME_DETAILS)
    private Object details;

    public static final String SERIALIZED_NAME_HELP = "help";
    @SerializedName(SERIALIZED_NAME_HELP)
    private String help;

    public static final String SERIALIZED_NAME_CODE = "code";
    @SerializedName(SERIALIZED_NAME_CODE)
    private BigDecimal code;


    public Error version(String version) {

        this.version = version;
        return this;
    }

    /**
     * Rasa version
     *
     * @return version
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Rasa version")

    public String getVersion() {
        return version;
    }


    public void setVersion(String version) {
        this.version = version;
    }


    public Error status(StatusEnum status) {

        this.status = status;
        return this;
    }

    /**
     * Status of the requested action
     *
     * @return status
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Status of the requested action")

    public StatusEnum getStatus() {
        return status;
    }


    public void setStatus(StatusEnum status) {
        this.status = status;
    }


    public Error message(String message) {

        this.message = message;
        return this;
    }

    /**
     * Error message
     *
     * @return message
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Error message")

    public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }


    public Error reason(String reason) {

        this.reason = reason;
        return this;
    }

    /**
     * Error category
     *
     * @return reason
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Error category")

    public String getReason() {
        return reason;
    }


    public void setReason(String reason) {
        this.reason = reason;
    }


    public Error details(Object details) {

        this.details = details;
        return this;
    }

    /**
     * Additional error information
     *
     * @return details
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Additional error information")

    public Object getDetails() {
        return details;
    }


    public void setDetails(Object details) {
        this.details = details;
    }


    public Error help(String help) {

        this.help = help;
        return this;
    }

    /**
     * Optional URL to additonal material
     *
     * @return help
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Optional URL to additonal material")

    public String getHelp() {
        return help;
    }


    public void setHelp(String help) {
        this.help = help;
    }


    public Error code(BigDecimal code) {

        this.code = code;
        return this;
    }

    /**
     * HTTP status code
     *
     * @return code
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "HTTP status code")

    public BigDecimal getCode() {
        return code;
    }


    public void setCode(BigDecimal code) {
        this.code = code;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Error error = (Error) o;
        return Objects.equals(this.version, error.version) &&
                Objects.equals(this.status, error.status) &&
                Objects.equals(this.message, error.message) &&
                Objects.equals(this.reason, error.reason) &&
                Objects.equals(this.details, error.details) &&
                Objects.equals(this.help, error.help) &&
                Objects.equals(this.code, error.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, status, message, reason, details, help, code);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Error {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
        sb.append("    help: ").append(toIndentedString(help)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

