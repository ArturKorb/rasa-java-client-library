package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * TemplateDescription
 */

public class TemplateDescription {
    public static final String SERIALIZED_NAME_TEXT = "text";
    @SerializedName(SERIALIZED_NAME_TEXT)
    private String text;


    public TemplateDescription text(String text) {

        this.text = text;
        return this;
    }

    /**
     * Template text
     *
     * @return text
     **/
    @ApiModelProperty(required = true, value = "Template text")

    public String getText() {
        return text;
    }


    public void setText(String text) {
        this.text = text;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateDescription templateDescription = (TemplateDescription) o;
        return Objects.equals(this.text, templateDescription.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateDescription {\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

