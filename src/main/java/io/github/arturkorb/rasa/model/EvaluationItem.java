package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Evaluation Result
 */
@ApiModel(description = "Evaluation Result")

public class EvaluationItem {
    public static final String SERIALIZED_NAME_REPORT = "report";
    @SerializedName(SERIALIZED_NAME_REPORT)
    private Object report;

    public static final String SERIALIZED_NAME_ACCURACY = "accuracy";
    @SerializedName(SERIALIZED_NAME_ACCURACY)
    private BigDecimal accuracy;

    public static final String SERIALIZED_NAME_F1_SCORE = "f1_score";
    @SerializedName(SERIALIZED_NAME_F1_SCORE)
    private BigDecimal f1Score;

    public static final String SERIALIZED_NAME_PRECISION = "precision";
    @SerializedName(SERIALIZED_NAME_PRECISION)
    private BigDecimal precision;

    public static final String SERIALIZED_NAME_PREDICTIONS = "predictions";
    @SerializedName(SERIALIZED_NAME_PREDICTIONS)
    private List<EvaluationItemPredictions> predictions = null;

    public static final String SERIALIZED_NAME_ERRORS = "errors";
    @SerializedName(SERIALIZED_NAME_ERRORS)
    private List<TestError> errors = null;


    public EvaluationItem report(Object report) {

        this.report = report;
        return this;
    }

    /**
     * Sklearn classification report, see http://scikit-learn.org/stable/modules/generated/sklearn.metrics.classification_report.html
     *
     * @return report
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "{\"greet\":{\"precision\":0.123,\"recall\":0.456,\"f1-score\":0.12,\"support\":100,\"confused_with\":{\"chitchat\":3,\"nlu_fallback\":5}},\"micro avg\":{\"precision\":0.123,\"recall\":0.456,\"f1-score\":0.12,\"support\":100},\"macro avg\":{\"precision\":0.123,\"recall\":0.456,\"f1-score\":0.12,\"support\":100},\"weightedq avg\":{\"precision\":0.123,\"recall\":0.456,\"f1-score\":0.12,\"support\":100}}", value = "Sklearn classification report, see http://scikit-learn.org/stable/modules/generated/sklearn.metrics.classification_report.html")

    public Object getReport() {
        return report;
    }


    public void setReport(Object report) {
        this.report = report;
    }


    public EvaluationItem accuracy(BigDecimal accuracy) {

        this.accuracy = accuracy;
        return this;
    }

    /**
     * Get accuracy
     *
     * @return accuracy
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "0.19047619047619047", value = "")

    public BigDecimal getAccuracy() {
        return accuracy;
    }


    public void setAccuracy(BigDecimal accuracy) {
        this.accuracy = accuracy;
    }


    public EvaluationItem f1Score(BigDecimal f1Score) {

        this.f1Score = f1Score;
        return this;
    }

    /**
     * Get f1Score
     *
     * @return f1Score
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "0.06095238095238095", value = "")

    public BigDecimal getF1Score() {
        return f1Score;
    }


    public void setF1Score(BigDecimal f1Score) {
        this.f1Score = f1Score;
    }


    public EvaluationItem precision(BigDecimal precision) {

        this.precision = precision;
        return this;
    }

    /**
     * Get precision
     *
     * @return precision
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "0.036281179138321996", value = "")

    public BigDecimal getPrecision() {
        return precision;
    }


    public void setPrecision(BigDecimal precision) {
        this.precision = precision;
    }


    public EvaluationItem predictions(List<EvaluationItemPredictions> predictions) {

        this.predictions = predictions;
        return this;
    }

    public EvaluationItem addPredictionsItem(EvaluationItemPredictions predictionsItem) {
        if (this.predictions == null) {
            this.predictions = new ArrayList<EvaluationItemPredictions>();
        }
        this.predictions.add(predictionsItem);
        return this;
    }

    /**
     * The predictions for each item in the test set
     *
     * @return predictions
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The predictions for each item in the test set")

    public List<EvaluationItemPredictions> getPredictions() {
        return predictions;
    }


    public void setPredictions(List<EvaluationItemPredictions> predictions) {
        this.predictions = predictions;
    }


    public EvaluationItem errors(List<TestError> errors) {

        this.errors = errors;
        return this;
    }

    public EvaluationItem addErrorsItem(TestError errorsItem) {
        if (this.errors == null) {
            this.errors = new ArrayList<TestError>();
        }
        this.errors.add(errorsItem);
        return this;
    }

    /**
     * The errors which were made during the testing.
     *
     * @return errors
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The errors which were made during the testing.")

    public List<TestError> getErrors() {
        return errors;
    }


    public void setErrors(List<TestError> errors) {
        this.errors = errors;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EvaluationItem evaluationItem = (EvaluationItem) o;
        return Objects.equals(this.report, evaluationItem.report) &&
                Objects.equals(this.accuracy, evaluationItem.accuracy) &&
                Objects.equals(this.f1Score, evaluationItem.f1Score) &&
                Objects.equals(this.precision, evaluationItem.precision) &&
                Objects.equals(this.predictions, evaluationItem.predictions) &&
                Objects.equals(this.errors, evaluationItem.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(report, accuracy, f1Score, precision, predictions, errors);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluationItem {\n");
        sb.append("    report: ").append(toIndentedString(report)).append("\n");
        sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
        sb.append("    f1Score: ").append(toIndentedString(f1Score)).append("\n");
        sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
        sb.append("    predictions: ").append(toIndentedString(predictions)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

