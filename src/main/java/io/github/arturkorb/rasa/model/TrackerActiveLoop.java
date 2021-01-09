package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Name of the active loop
 */
@ApiModel(description = "Name of the active loop")

public class TrackerActiveLoop {
    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;


    public TrackerActiveLoop name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Name of the active loop
     *
     * @return name
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "restaurant_form", value = "Name of the active loop")

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
        TrackerActiveLoop trackerActiveLoop = (TrackerActiveLoop) o;
        return Objects.equals(this.name, trackerActiveLoop.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrackerActiveLoop {\n");
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

