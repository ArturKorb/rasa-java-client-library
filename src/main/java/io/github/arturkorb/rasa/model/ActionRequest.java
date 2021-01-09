package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * ActionRequest
 */

public class ActionRequest {
    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_POLICY = "policy";
    @SerializedName(SERIALIZED_NAME_POLICY)
    private String policy;

    public static final String SERIALIZED_NAME_CONFIDENCE = "confidence";
    @SerializedName(SERIALIZED_NAME_CONFIDENCE)
    private BigDecimal confidence;


    public ActionRequest name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Name of the action to be executed.
     *
     * @return name
     **/
    @ApiModelProperty(example = "utter_greet", required = true, value = "Name of the action to be executed.")

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public ActionRequest policy(String policy) {

        this.policy = policy;
        return this;
    }

    /**
     * Name of the policy that predicted the action.
     *
     * @return policy
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Name of the policy that predicted the action.")

    public String getPolicy() {
        return policy;
    }


    public void setPolicy(String policy) {
        this.policy = policy;
    }


    public ActionRequest confidence(BigDecimal confidence) {

        this.confidence = confidence;
        return this;
    }

    /**
     * Confidence of the prediction.
     *
     * @return confidence
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "0.987232", value = "Confidence of the prediction.")

    public BigDecimal getConfidence() {
        return confidence;
    }


    public void setConfidence(BigDecimal confidence) {
        this.confidence = confidence;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionRequest actionRequest = (ActionRequest) o;
        return Objects.equals(this.name, actionRequest.name) &&
                Objects.equals(this.policy, actionRequest.policy) &&
                Objects.equals(this.confidence, actionRequest.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, policy, confidence);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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

