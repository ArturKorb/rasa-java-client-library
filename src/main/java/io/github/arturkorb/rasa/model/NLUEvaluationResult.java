package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * NLUEvaluationResult
 */

public class NLUEvaluationResult {
    public static final String SERIALIZED_NAME_INTENT_EVALUATION = "intent_evaluation";
    @SerializedName(SERIALIZED_NAME_INTENT_EVALUATION)
    private EvaluationItem intentEvaluation;

    public static final String SERIALIZED_NAME_RESPONSE_SELECTION_EVALUATION = "response_selection_evaluation";
    @SerializedName(SERIALIZED_NAME_RESPONSE_SELECTION_EVALUATION)
    private EvaluationItem responseSelectionEvaluation;

    public static final String SERIALIZED_NAME_ENTITY_EVALUATION = "entity_evaluation";
    @SerializedName(SERIALIZED_NAME_ENTITY_EVALUATION)
    private Map<String, EvaluationItem> entityEvaluation = null;


    public NLUEvaluationResult intentEvaluation(EvaluationItem intentEvaluation) {

        this.intentEvaluation = intentEvaluation;
        return this;
    }

    /**
     * Get intentEvaluation
     *
     * @return intentEvaluation
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public EvaluationItem getIntentEvaluation() {
        return intentEvaluation;
    }


    public void setIntentEvaluation(EvaluationItem intentEvaluation) {
        this.intentEvaluation = intentEvaluation;
    }


    public NLUEvaluationResult responseSelectionEvaluation(EvaluationItem responseSelectionEvaluation) {

        this.responseSelectionEvaluation = responseSelectionEvaluation;
        return this;
    }

    /**
     * Get responseSelectionEvaluation
     *
     * @return responseSelectionEvaluation
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public EvaluationItem getResponseSelectionEvaluation() {
        return responseSelectionEvaluation;
    }


    public void setResponseSelectionEvaluation(EvaluationItem responseSelectionEvaluation) {
        this.responseSelectionEvaluation = responseSelectionEvaluation;
    }


    public NLUEvaluationResult entityEvaluation(Map<String, EvaluationItem> entityEvaluation) {

        this.entityEvaluation = entityEvaluation;
        return this;
    }

    public NLUEvaluationResult putEntityEvaluationItem(String key, EvaluationItem entityEvaluationItem) {
        if (this.entityEvaluation == null) {
            this.entityEvaluation = new HashMap<String, EvaluationItem>();
        }
        this.entityEvaluation.put(key, entityEvaluationItem);
        return this;
    }

    /**
     * Rasa NLU entity evaluation.
     *
     * @return entityEvaluation
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Rasa NLU entity evaluation.")

    public Map<String, EvaluationItem> getEntityEvaluation() {
        return entityEvaluation;
    }


    public void setEntityEvaluation(Map<String, EvaluationItem> entityEvaluation) {
        this.entityEvaluation = entityEvaluation;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NLUEvaluationResult nlUEvaluationResult = (NLUEvaluationResult) o;
        return Objects.equals(this.intentEvaluation, nlUEvaluationResult.intentEvaluation) &&
                Objects.equals(this.responseSelectionEvaluation, nlUEvaluationResult.responseSelectionEvaluation) &&
                Objects.equals(this.entityEvaluation, nlUEvaluationResult.entityEvaluation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intentEvaluation, responseSelectionEvaluation, entityEvaluation);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NLUEvaluationResult {\n");
        sb.append("    intentEvaluation: ").append(toIndentedString(intentEvaluation)).append("\n");
        sb.append("    responseSelectionEvaluation: ").append(toIndentedString(responseSelectionEvaluation)).append("\n");
        sb.append("    entityEvaluation: ").append(toIndentedString(entityEvaluation)).append("\n");
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

