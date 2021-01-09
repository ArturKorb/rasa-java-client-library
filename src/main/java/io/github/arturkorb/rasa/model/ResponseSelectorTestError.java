package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Error during response prediction which was made during testing
 */
@ApiModel(description = "Error during response prediction which was made during testing")

public class ResponseSelectorTestError implements TestError {
    public static final String SERIALIZED_NAME_TEXT = "text";
    @SerializedName(SERIALIZED_NAME_TEXT)
    private String text;

    public static final String SERIALIZED_NAME_INTENT_RESPONSE_KEY_TARGET = "intent_response_key_target";
    @SerializedName(SERIALIZED_NAME_INTENT_RESPONSE_KEY_TARGET)
    private String intentResponseKeyTarget;

    public static final String SERIALIZED_NAME_INTENT_RESPONSE_KEY_PREDICTION = "intent_response_key_prediction";
    @SerializedName(SERIALIZED_NAME_INTENT_RESPONSE_KEY_PREDICTION)
    private Intent intentResponseKeyPrediction;


    public ResponseSelectorTestError text(String text) {

        this.text = text;
        return this;
    }

    /**
     * Test message
     *
     * @return text
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "are you alright?", value = "Test message")

    public String getText() {
        return text;
    }


    public void setText(String text) {
        this.text = text;
    }


    public ResponseSelectorTestError intentResponseKeyTarget(String intentResponseKeyTarget) {

        this.intentResponseKeyTarget = intentResponseKeyTarget;
        return this;
    }

    /**
     * Expected retrieval intent
     *
     * @return intentResponseKeyTarget
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Expected retrieval intent")

    public String getIntentResponseKeyTarget() {
        return intentResponseKeyTarget;
    }


    public void setIntentResponseKeyTarget(String intentResponseKeyTarget) {
        this.intentResponseKeyTarget = intentResponseKeyTarget;
    }


    public ResponseSelectorTestError intentResponseKeyPrediction(Intent intentResponseKeyPrediction) {

        this.intentResponseKeyPrediction = intentResponseKeyPrediction;
        return this;
    }

    /**
     * Get intentResponseKeyPrediction
     *
     * @return intentResponseKeyPrediction
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Intent getIntentResponseKeyPrediction() {
        return intentResponseKeyPrediction;
    }


    public void setIntentResponseKeyPrediction(Intent intentResponseKeyPrediction) {
        this.intentResponseKeyPrediction = intentResponseKeyPrediction;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponseSelectorTestError responseSelectorTestError = (ResponseSelectorTestError) o;
        return Objects.equals(this.text, responseSelectorTestError.text) &&
                Objects.equals(this.intentResponseKeyTarget, responseSelectorTestError.intentResponseKeyTarget) &&
                Objects.equals(this.intentResponseKeyPrediction, responseSelectorTestError.intentResponseKeyPrediction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, intentResponseKeyTarget, intentResponseKeyPrediction);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseSelectorTestError {\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    intentResponseKeyTarget: ").append(toIndentedString(intentResponseKeyTarget)).append("\n");
        sb.append("    intentResponseKeyPrediction: ").append(toIndentedString(intentResponseKeyPrediction)).append("\n");
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

