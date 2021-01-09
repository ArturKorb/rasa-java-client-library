package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * PredictResultScores
 */

public class PredictResultScores {
    public static final String SERIALIZED_NAME_ACTION = "action";
    @SerializedName(SERIALIZED_NAME_ACTION)
    private String action;

    public static final String SERIALIZED_NAME_SCORE = "score";
    @SerializedName(SERIALIZED_NAME_SCORE)
    private BigDecimal score;


    public PredictResultScores action(String action) {

        this.action = action;
        return this;
    }

    /**
     * Action name
     *
     * @return action
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "utter_greet", value = "Action name")

    public String getAction() {
        return action;
    }


    public void setAction(String action) {
        this.action = action;
    }


    public PredictResultScores score(BigDecimal score) {

        this.score = score;
        return this;
    }

    /**
     * Assigned score
     *
     * @return score
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "1.0", value = "Assigned score")

    public BigDecimal getScore() {
        return score;
    }


    public void setScore(BigDecimal score) {
        this.score = score;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PredictResultScores predictResultScores = (PredictResultScores) o;
        return Objects.equals(this.action, predictResultScores.action) &&
                Objects.equals(this.score, predictResultScores.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, score);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PredictResultScores {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

