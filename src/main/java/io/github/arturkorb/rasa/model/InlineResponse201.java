package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * InlineResponse2001
 */

public class InlineResponse201 {
    public static final String SERIALIZED_NAME_FINGERPRINT = "fingerprint";
    @SerializedName(SERIALIZED_NAME_FINGERPRINT)
    private Object fingerprint;

    public static final String SERIALIZED_NAME_MODEL_FILE = "model_file";
    @SerializedName(SERIALIZED_NAME_MODEL_FILE)
    private String modelFile;

    public static final String SERIALIZED_NAME_NUM_ACTIVE_TRAINING_JOBS = "num_active_training_jobs";
    @SerializedName(SERIALIZED_NAME_NUM_ACTIVE_TRAINING_JOBS)
    private Integer numActiveTrainingJobs;


    public InlineResponse201 fingerprint(Object fingerprint) {

        this.fingerprint = fingerprint;
        return this;
    }

    /**
     * Fingerprint of the loaded model
     *
     * @return fingerprint
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "{\"config\":[\"7625d69d93053ac8520a544d0852c626\"],\"domain\":[\"229b51e41876bbcbbbfbeddf79548d5a\"],\"messages\":[\"cf7eda7edcae128a75ee8c95d3bbd680\"],\"stories\":[\"b5facea681fd00bc7ecc6818c70d9639\"],\"trained_at\":1.55652712342784E9,\"version\":\"1.0.0\"}", value = "Fingerprint of the loaded model")

    public Object getFingerprint() {
        return fingerprint;
    }


    public void setFingerprint(Object fingerprint) {
        this.fingerprint = fingerprint;
    }


    public InlineResponse201 modelFile(String modelFile) {

        this.modelFile = modelFile;
        return this;
    }

    /**
     * Path of the loaded model
     *
     * @return modelFile
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "20190429-103105.tar.gz", value = "Path of the loaded model")

    public String getModelFile() {
        return modelFile;
    }


    public void setModelFile(String modelFile) {
        this.modelFile = modelFile;
    }


    public InlineResponse201 numActiveTrainingJobs(Integer numActiveTrainingJobs) {

        this.numActiveTrainingJobs = numActiveTrainingJobs;
        return this;
    }

    /**
     * Number of running training processes
     *
     * @return numActiveTrainingJobs
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "2", value = "Number of running training processes")

    public Integer getNumActiveTrainingJobs() {
        return numActiveTrainingJobs;
    }


    public void setNumActiveTrainingJobs(Integer numActiveTrainingJobs) {
        this.numActiveTrainingJobs = numActiveTrainingJobs;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InlineResponse201 inlineResponse201 = (InlineResponse201) o;
        return Objects.equals(this.fingerprint, inlineResponse201.fingerprint) &&
                Objects.equals(this.modelFile, inlineResponse201.modelFile) &&
                Objects.equals(this.numActiveTrainingJobs, inlineResponse201.numActiveTrainingJobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fingerprint, modelFile, numActiveTrainingJobs);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineResponse2001 {\n");
        sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
        sb.append("    modelFile: ").append(toIndentedString(modelFile)).append("\n");
        sb.append("    numActiveTrainingJobs: ").append(toIndentedString(numActiveTrainingJobs)).append("\n");
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

