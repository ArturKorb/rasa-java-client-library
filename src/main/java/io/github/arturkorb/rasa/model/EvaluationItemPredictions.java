package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * EvaluationItemPredictions
 */

public class EvaluationItemPredictions {
    public static final String SERIALIZED_NAME_INTENT = "intent";
    @SerializedName(SERIALIZED_NAME_INTENT)
    private String intent;

    public static final String SERIALIZED_NAME_PREDICTED = "predicted";
    @SerializedName(SERIALIZED_NAME_PREDICTED)
    private String predicted;

    public static final String SERIALIZED_NAME_TEXT = "text";
    @SerializedName(SERIALIZED_NAME_TEXT)
    private String text;

    public static final String SERIALIZED_NAME_CONFIDENCE = "confidence";
    @SerializedName(SERIALIZED_NAME_CONFIDENCE)
    private BigDecimal confidence;


    public EvaluationItemPredictions intent(String intent) {

        this.intent = intent;
        return this;
    }

    /**
     * Get intent
     *
     * @return intent
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "greet", value = "")

    public String getIntent() {
        return intent;
    }


    public void setIntent(String intent) {
        this.intent = intent;
    }


    public EvaluationItemPredictions predicted(String predicted) {

        this.predicted = predicted;
        return this;
    }

    /**
     * Get predicted
     *
     * @return predicted
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "greet", value = "")

    public String getPredicted() {
        return predicted;
    }


    public void setPredicted(String predicted) {
        this.predicted = predicted;
    }


    public EvaluationItemPredictions text(String text) {

        this.text = text;
        return this;
    }

    /**
     * Get text
     *
     * @return text
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "hey", value = "")

    public String getText() {
        return text;
    }


    public void setText(String text) {
        this.text = text;
    }


    public EvaluationItemPredictions confidence(BigDecimal confidence) {

        this.confidence = confidence;
        return this;
    }

    /**
     * Get confidence
     *
     * @return confidence
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "0.9973567", value = "")

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
        EvaluationItemPredictions evaluationItemPredictions = (EvaluationItemPredictions) o;
        return Objects.equals(this.intent, evaluationItemPredictions.intent) &&
                Objects.equals(this.predicted, evaluationItemPredictions.predicted) &&
                Objects.equals(this.text, evaluationItemPredictions.text) &&
                Objects.equals(this.confidence, evaluationItemPredictions.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intent, predicted, text, confidence);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluationItemPredictions {\n");
        sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
        sb.append("    predicted: ").append(toIndentedString(predicted)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

