package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * EvaluationStoriesResult
 */

public class EvaluationStoriesResult {
    public static final String SERIALIZED_NAME_ACTIONS = "actions";
    @SerializedName(SERIALIZED_NAME_ACTIONS)
    private List<EvaluationStoriesResultActions> actions = null;

    public static final String SERIALIZED_NAME_IS_END_TO_END_EVALUATION = "is_end_to_end_evaluation";
    @SerializedName(SERIALIZED_NAME_IS_END_TO_END_EVALUATION)
    private Boolean isEndToEndEvaluation;

    public static final String SERIALIZED_NAME_PRECISION = "precision";
    @SerializedName(SERIALIZED_NAME_PRECISION)
    private BigDecimal precision;

    public static final String SERIALIZED_NAME_F1 = "f1";
    @SerializedName(SERIALIZED_NAME_F1)
    private BigDecimal f1;

    public static final String SERIALIZED_NAME_ACCURACY = "accuracy";
    @SerializedName(SERIALIZED_NAME_ACCURACY)
    private BigDecimal accuracy;

    public static final String SERIALIZED_NAME_IN_TRAINING_DATA_FRACTION = "in_training_data_fraction";
    @SerializedName(SERIALIZED_NAME_IN_TRAINING_DATA_FRACTION)
    private BigDecimal inTrainingDataFraction;

    public static final String SERIALIZED_NAME_REPORT = "report";
    @SerializedName(SERIALIZED_NAME_REPORT)
    private String report;


    public EvaluationStoriesResult actions(List<EvaluationStoriesResultActions> actions) {

        this.actions = actions;
        return this;
    }

    public EvaluationStoriesResult addActionsItem(EvaluationStoriesResultActions actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<EvaluationStoriesResultActions>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    /**
     * Accuracy of the classification, http://scikit-learn.org/stable/modules/generated/sklearn.metrics.accuracy_score.html
     *
     * @return actions
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Accuracy of the classification, http://scikit-learn.org/stable/modules/generated/sklearn.metrics.accuracy_score.html")

    public List<EvaluationStoriesResultActions> getActions() {
        return actions;
    }


    public void setActions(List<EvaluationStoriesResultActions> actions) {
        this.actions = actions;
    }


    public EvaluationStoriesResult isEndToEndEvaluation(Boolean isEndToEndEvaluation) {

        this.isEndToEndEvaluation = isEndToEndEvaluation;
        return this;
    }

    /**
     * True if evaluation is end-to-end, false otherwise
     *
     * @return isEndToEndEvaluation
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "true", value = "True if evaluation is end-to-end, false otherwise")

    public Boolean getIsEndToEndEvaluation() {
        return isEndToEndEvaluation;
    }


    public void setIsEndToEndEvaluation(Boolean isEndToEndEvaluation) {
        this.isEndToEndEvaluation = isEndToEndEvaluation;
    }


    public EvaluationStoriesResult precision(BigDecimal precision) {

        this.precision = precision;
        return this;
    }

    /**
     * Precision of the classification, see http://scikit-learn.org/stable/modules/generated/sklearn.metrics.precision_score.html
     *
     * @return precision
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "1.0", value = "Precision of the classification, see http://scikit-learn.org/stable/modules/generated/sklearn.metrics.precision_score.html")

    public BigDecimal getPrecision() {
        return precision;
    }


    public void setPrecision(BigDecimal precision) {
        this.precision = precision;
    }


    public EvaluationStoriesResult f1(BigDecimal f1) {

        this.f1 = f1;
        return this;
    }

    /**
     * F1 score of the classification, http://scikit-learn.org/stable/modules/generated/sklearn.metrics.precision_score.html
     *
     * @return f1
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "0.9333333333333333", value = "F1 score of the classification, http://scikit-learn.org/stable/modules/generated/sklearn.metrics.precision_score.html")

    public BigDecimal getF1() {
        return f1;
    }


    public void setF1(BigDecimal f1) {
        this.f1 = f1;
    }


    public EvaluationStoriesResult accuracy(BigDecimal accuracy) {

        this.accuracy = accuracy;
        return this;
    }

    /**
     * Accuracy of the classification, http://scikit-learn.org/stable/modules/generated/sklearn.metrics.accuracy_score.html
     *
     * @return accuracy
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "0.9", value = "Accuracy of the classification, http://scikit-learn.org/stable/modules/generated/sklearn.metrics.accuracy_score.html")

    public BigDecimal getAccuracy() {
        return accuracy;
    }


    public void setAccuracy(BigDecimal accuracy) {
        this.accuracy = accuracy;
    }


    public EvaluationStoriesResult inTrainingDataFraction(BigDecimal inTrainingDataFraction) {

        this.inTrainingDataFraction = inTrainingDataFraction;
        return this;
    }

    /**
     * Fraction of stories that are present in the training data of the model loaded at evaluation time.
     *
     * @return inTrainingDataFraction
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "0.8571428571428571", value = "Fraction of stories that are present in the training data of the model loaded at evaluation time.")

    public BigDecimal getInTrainingDataFraction() {
        return inTrainingDataFraction;
    }


    public void setInTrainingDataFraction(BigDecimal inTrainingDataFraction) {
        this.inTrainingDataFraction = inTrainingDataFraction;
    }


    public EvaluationStoriesResult report(String report) {

        this.report = report;
        return this;
    }

    /**
     * Sklearn classification report, see http://scikit-learn.org/stable/modules/generated/sklearn.metrics.classification_report.html
     *
     * @return report
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "# classification report                        precision    recall  f1-score   support         action_listen       1.00      1.00      1.00         3                 greet       1.00      1.00      1.00         1                inform       1.00      1.00      1.00         2  utter_ask_howcanhelp       1.00      1.00      1.00         1    utter_ask_location       1.00      1.00      1.00         1   utter_ask_numpeople       0.00      0.00      0.00         0           utter_on_it       1.00      0.50      0.67         2            avg / total       1.00      0.90      0.93        10", value = "Sklearn classification report, see http://scikit-learn.org/stable/modules/generated/sklearn.metrics.classification_report.html")

    public String getReport() {
        return report;
    }


    public void setReport(String report) {
        this.report = report;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EvaluationStoriesResult evaluationStoriesResult = (EvaluationStoriesResult) o;
        return Objects.equals(this.actions, evaluationStoriesResult.actions) &&
                Objects.equals(this.isEndToEndEvaluation, evaluationStoriesResult.isEndToEndEvaluation) &&
                Objects.equals(this.precision, evaluationStoriesResult.precision) &&
                Objects.equals(this.f1, evaluationStoriesResult.f1) &&
                Objects.equals(this.accuracy, evaluationStoriesResult.accuracy) &&
                Objects.equals(this.inTrainingDataFraction, evaluationStoriesResult.inTrainingDataFraction) &&
                Objects.equals(this.report, evaluationStoriesResult.report);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actions, isEndToEndEvaluation, precision, f1, accuracy, inTrainingDataFraction, report);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluationStoriesResult {\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    isEndToEndEvaluation: ").append(toIndentedString(isEndToEndEvaluation)).append("\n");
        sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
        sb.append("    f1: ").append(toIndentedString(f1)).append("\n");
        sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
        sb.append("    inTrainingDataFraction: ").append(toIndentedString(inTrainingDataFraction)).append("\n");
        sb.append("    report: ").append(toIndentedString(report)).append("\n");
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

