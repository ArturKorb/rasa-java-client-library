package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * InlineResponse200
 */

public class InlineResponse200 {
    public static final String SERIALIZED_NAME_VERSION = "version";
    @SerializedName(SERIALIZED_NAME_VERSION)
    private String version;

    public static final String SERIALIZED_NAME_MINIMUM_COMPATIBLE_VERSION = "minimum_compatible_version";
    @SerializedName(SERIALIZED_NAME_MINIMUM_COMPATIBLE_VERSION)
    private String minimumCompatibleVersion;


    public InlineResponse200 version(String version) {

        this.version = version;
        return this;
    }

    /**
     * Rasa version number
     *
     * @return version
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Rasa version number")

    public String getVersion() {
        return version;
    }


    public void setVersion(String version) {
        this.version = version;
    }


    public InlineResponse200 minimumCompatibleVersion(String minimumCompatibleVersion) {

        this.minimumCompatibleVersion = minimumCompatibleVersion;
        return this;
    }

    /**
     * Minimum version this Rasa version is able to load models from
     *
     * @return minimumCompatibleVersion
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Minimum version this Rasa version is able to load models from")

    public String getMinimumCompatibleVersion() {
        return minimumCompatibleVersion;
    }


    public void setMinimumCompatibleVersion(String minimumCompatibleVersion) {
        this.minimumCompatibleVersion = minimumCompatibleVersion;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InlineResponse200 inlineResponse200 = (InlineResponse200) o;
        return Objects.equals(this.version, inlineResponse200.version) &&
                Objects.equals(this.minimumCompatibleVersion, inlineResponse200.minimumCompatibleVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, minimumCompatibleVersion);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineResponse200 {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    minimumCompatibleVersion: ").append(toIndentedString(minimumCompatibleVersion)).append("\n");
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

