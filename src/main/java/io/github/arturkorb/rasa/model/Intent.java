package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Intent of the text
 */
@ApiModel(description = "Intent of the text")

public class Intent {
    public static final String SERIALIZED_NAME_CONFIDENCE = "confidence";
    @SerializedName(SERIALIZED_NAME_CONFIDENCE)
    private BigDecimal confidence;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;


    public Intent confidence(BigDecimal confidence) {

        this.confidence = confidence;
        return this;
    }

    /**
     * Confidence of the intent
     *
     * @return confidence
     **/
    @ApiModelProperty(example = "0.6323", required = true, value = "Confidence of the intent")

    public BigDecimal getConfidence() {
        return confidence;
    }


    public void setConfidence(BigDecimal confidence) {
        this.confidence = confidence;
    }


    public Intent name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Intent name
     *
     * @return name
     **/
    @ApiModelProperty(example = "greet", required = true, value = "Intent name")

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Intent intent = (Intent) o;
        return Objects.equals(this.confidence, intent.confidence) &&
                Objects.equals(this.name, intent.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(confidence, name);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Intent {\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

