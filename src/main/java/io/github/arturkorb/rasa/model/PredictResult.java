package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * PredictResult
 */

public class PredictResult {
    public static final String SERIALIZED_NAME_SCORES = "scores";
    @SerializedName(SERIALIZED_NAME_SCORES)
    private List<PredictResultScores> scores = null;

    public static final String SERIALIZED_NAME_POLICY = "policy";
    @SerializedName(SERIALIZED_NAME_POLICY)
    private String policy;

    public static final String SERIALIZED_NAME_TRACKER = "tracker";
    @SerializedName(SERIALIZED_NAME_TRACKER)
    private Tracker tracker;


    public PredictResult scores(List<PredictResultScores> scores) {

        this.scores = scores;
        return this;
    }

    public PredictResult addScoresItem(PredictResultScores scoresItem) {
        if (this.scores == null) {
            this.scores = new ArrayList<PredictResultScores>();
        }
        this.scores.add(scoresItem);
        return this;
    }

    /**
     * Prediction results
     *
     * @return scores
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Prediction results")

    public List<PredictResultScores> getScores() {
        return scores;
    }


    public void setScores(List<PredictResultScores> scores) {
        this.scores = scores;
    }


    public PredictResult policy(String policy) {

        this.policy = policy;
        return this;
    }

    /**
     * Policy which predicted the most likely action
     *
     * @return policy
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "policy_2_TEDPolicy", value = "Policy which predicted the most likely action")

    public String getPolicy() {
        return policy;
    }


    public void setPolicy(String policy) {
        this.policy = policy;
    }


    public PredictResult tracker(Tracker tracker) {

        this.tracker = tracker;
        return this;
    }

    /**
     * Get tracker
     *
     * @return tracker
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Tracker getTracker() {
        return tracker;
    }


    public void setTracker(Tracker tracker) {
        this.tracker = tracker;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PredictResult predictResult = (PredictResult) o;
        return Objects.equals(this.scores, predictResult.scores) &&
                Objects.equals(this.policy, predictResult.policy) &&
                Objects.equals(this.tracker, predictResult.tracker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scores, policy, tracker);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PredictResult {\n");
        sb.append("    scores: ").append(toIndentedString(scores)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    tracker: ").append(toIndentedString(tracker)).append("\n");
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

