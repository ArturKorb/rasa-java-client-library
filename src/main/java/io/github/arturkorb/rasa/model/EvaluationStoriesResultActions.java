package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * EvaluationStoriesResultActions
 */

public class EvaluationStoriesResultActions {
    public static final String SERIALIZED_NAME_ACTION = "action";
    @SerializedName(SERIALIZED_NAME_ACTION)
    private String action;

    public static final String SERIALIZED_NAME_PREDICTED = "predicted";
    @SerializedName(SERIALIZED_NAME_PREDICTED)
    private String predicted;

    public static final String SERIALIZED_NAME_POLICY = "policy";
    @SerializedName(SERIALIZED_NAME_POLICY)
    private String policy;

    public static final String SERIALIZED_NAME_CONFIDENCE = "confidence";
    @SerializedName(SERIALIZED_NAME_CONFIDENCE)
    private String confidence;


    public EvaluationStoriesResultActions action(String action) {

        this.action = action;
        return this;
    }

    /**
     * Name of the actual action
     *
     * @return action
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "utter_ask_howcanhelp", value = "Name of the actual action")

    public String getAction() {
        return action;
    }


    public void setAction(String action) {
        this.action = action;
    }


    public EvaluationStoriesResultActions predicted(String predicted) {

        this.predicted = predicted;
        return this;
    }

    /**
     * Name of the predicted action
     *
     * @return predicted
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "utter_ask_howcanhelp", value = "Name of the predicted action")

    public String getPredicted() {
        return predicted;
    }


    public void setPredicted(String predicted) {
        this.predicted = predicted;
    }


    public EvaluationStoriesResultActions policy(String policy) {

        this.policy = policy;
        return this;
    }

    /**
     * Machine-learning policy used in the prediction
     *
     * @return policy
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "policy_0_MemoizationPolicy", value = "Machine-learning policy used in the prediction")

    public String getPolicy() {
        return policy;
    }


    public void setPolicy(String policy) {
        this.policy = policy;
    }


    public EvaluationStoriesResultActions confidence(String confidence) {

        this.confidence = confidence;
        return this;
    }

    /**
     * Confidence score of the prediction
     *
     * @return confidence
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "1.0", value = "Confidence score of the prediction")

    public String getConfidence() {
        return confidence;
    }


    public void setConfidence(String confidence) {
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
        EvaluationStoriesResultActions evaluationStoriesResultActions = (EvaluationStoriesResultActions) o;
        return Objects.equals(this.action, evaluationStoriesResultActions.action) &&
                Objects.equals(this.predicted, evaluationStoriesResultActions.predicted) &&
                Objects.equals(this.policy, evaluationStoriesResultActions.policy) &&
                Objects.equals(this.confidence, evaluationStoriesResultActions.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, predicted, policy, confidence);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluationStoriesResultActions {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    predicted: ").append(toIndentedString(predicted)).append("\n");
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

