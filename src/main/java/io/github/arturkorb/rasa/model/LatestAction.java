package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Latest bot action.
 */
@ApiModel(description = "Latest bot action.")

public class LatestAction {
    public static final String SERIALIZED_NAME_ACTION_NAME = "action_name";
    @SerializedName(SERIALIZED_NAME_ACTION_NAME)
    private String actionName;

    public static final String SERIALIZED_NAME_ACTION_TEXT = "action_text";
    @SerializedName(SERIALIZED_NAME_ACTION_TEXT)
    private String actionText;


    public LatestAction actionName(String actionName) {

        this.actionName = actionName;
        return this;
    }

    /**
     * latest action name
     *
     * @return actionName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "latest action name")

    public String getActionName() {
        return actionName;
    }


    public void setActionName(String actionName) {
        this.actionName = actionName;
    }


    public LatestAction actionText(String actionText) {

        this.actionText = actionText;
        return this;
    }

    /**
     * text of last bot utterance
     *
     * @return actionText
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "text of last bot utterance")

    public String getActionText() {
        return actionText;
    }


    public void setActionText(String actionText) {
        this.actionText = actionText;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LatestAction latestAction = (LatestAction) o;
        return Objects.equals(this.actionName, latestAction.actionName) &&
                Objects.equals(this.actionText, latestAction.actionText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionName, actionText);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LatestAction {\n");
        sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
        sb.append("    actionText: ").append(toIndentedString(actionText)).append("\n");
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

