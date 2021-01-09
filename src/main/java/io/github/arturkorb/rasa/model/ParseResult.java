package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * NLU parser information. If set, message will not be passed through NLU, but instead this parsing information will be used.
 */
@ApiModel(description = "NLU parser information. If set, message will not be passed through NLU, but instead this parsing information will be used.")

public class ParseResult {
    public static final String SERIALIZED_NAME_ENTITIES = "entities";
    @SerializedName(SERIALIZED_NAME_ENTITIES)
    private List<Entity> entities = null;

    public static final String SERIALIZED_NAME_INTENT = "intent";
    @SerializedName(SERIALIZED_NAME_INTENT)
    private Intent intent;

    public static final String SERIALIZED_NAME_INTENT_RANKING = "intent_ranking";
    @SerializedName(SERIALIZED_NAME_INTENT_RANKING)
    private List<Intent> intentRanking = null;

    public static final String SERIALIZED_NAME_TEXT = "text";
    @SerializedName(SERIALIZED_NAME_TEXT)
    private String text;


    public ParseResult entities(List<Entity> entities) {

        this.entities = entities;
        return this;
    }

    public ParseResult addEntitiesItem(Entity entitiesItem) {
        if (this.entities == null) {
            this.entities = new ArrayList<Entity>();
        }
        this.entities.add(entitiesItem);
        return this;
    }

    /**
     * Parsed entities
     *
     * @return entities
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Parsed entities")

    public List<Entity> getEntities() {
        return entities;
    }


    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }


    public ParseResult intent(Intent intent) {

        this.intent = intent;
        return this;
    }

    /**
     * Get intent
     *
     * @return intent
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Intent getIntent() {
        return intent;
    }


    public void setIntent(Intent intent) {
        this.intent = intent;
    }


    public ParseResult intentRanking(List<Intent> intentRanking) {

        this.intentRanking = intentRanking;
        return this;
    }

    public ParseResult addIntentRankingItem(Intent intentRankingItem) {
        if (this.intentRanking == null) {
            this.intentRanking = new ArrayList<Intent>();
        }
        this.intentRanking.add(intentRankingItem);
        return this;
    }

    /**
     * Scores of all intents
     *
     * @return intentRanking
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Scores of all intents")

    public List<Intent> getIntentRanking() {
        return intentRanking;
    }


    public void setIntentRanking(List<Intent> intentRanking) {
        this.intentRanking = intentRanking;
    }


    public ParseResult text(String text) {

        this.text = text;
        return this;
    }

    /**
     * Text of the message
     *
     * @return text
     **/
    @ApiModelProperty(example = "Hello!", required = true, value = "Text of the message")

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
        ParseResult parseResult = (ParseResult) o;
        return Objects.equals(this.entities, parseResult.entities) &&
                Objects.equals(this.intent, parseResult.intent) &&
                Objects.equals(this.intentRanking, parseResult.intentRanking) &&
                Objects.equals(this.text, parseResult.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entities, intent, intentRanking, text);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParseResult {\n");
        sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
        sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
        sb.append("    intentRanking: ").append(toIndentedString(intentRanking)).append("\n");
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

