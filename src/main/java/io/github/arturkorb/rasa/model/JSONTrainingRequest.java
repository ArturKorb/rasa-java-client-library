package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * JSONTrainingRequest
 */

public class JSONTrainingRequest implements TrainingRequest {

    public static final String SERIALIZED_NAME_DOMAIN = "domain";
    @SerializedName(SERIALIZED_NAME_DOMAIN)
    private String domain;

    public static final String SERIALIZED_NAME_CONFIG = "config";
    @SerializedName(SERIALIZED_NAME_CONFIG)
    private String config;

    public static final String SERIALIZED_NAME_NLU = "nlu";
    @SerializedName(SERIALIZED_NAME_NLU)
    private String nlu;

    public static final String SERIALIZED_NAME_RESPONSES = "responses";
    @SerializedName(SERIALIZED_NAME_RESPONSES)
    private String responses;

    public static final String SERIALIZED_NAME_STORIES = "stories";
    @SerializedName(SERIALIZED_NAME_STORIES)
    private String stories;

    public static final String SERIALIZED_NAME_RULES = "rules";
    @SerializedName(SERIALIZED_NAME_RULES)
    private String rules;

    public static final String SERIALIZED_NAME_FORCE = "force";
    @SerializedName(SERIALIZED_NAME_FORCE)
    private Boolean force;

    public static final String SERIALIZED_NAME_SAVE_TO_DEFAULT_MODEL_DIRECTORY = "save_to_default_model_directory";
    @SerializedName(SERIALIZED_NAME_SAVE_TO_DEFAULT_MODEL_DIRECTORY)
    private Boolean saveToDefaultModelDirectory;

    public static final String OUT = "out";
    @SerializedName(OUT)
    private String out;

    public JSONTrainingRequest() {
        this.stories = "";
        this.nlu = "";
        this.domain = "";
        this.config = "";
        this.rules = "";
        this.responses = "";
    }

    public JSONTrainingRequest domain(String domain) {

        this.domain = domain;
        return this;
    }

    /**
     * Rasa domain in plain text
     *
     * @return domain
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "intents:   - greet   - goodbye   - affirm   - deny   - mood_great   - mood_unhappy  responses:   utter_greet:   - text: \"Hey! How are you?\"    utter_cheer_up:   - text: \"Here is something to cheer you up:\"     image: \"https://i.imgur.com/nGF1K8f.jpg\"    utter_did_that_help:   - text: \"Did that help you?\"    utter_happy:   - text: \"Great carry on!\"    utter_goodbye:   - text: \"Bye\"", value = "Rasa domain in plain text")

    public String getDomain() {
        return domain;
    }


    public void setDomain(String domain) {
        this.domain = domain;
    }


    public JSONTrainingRequest config(String config) {

        this.config = config;
        return this;
    }

    /**
     * Rasa config in plain text
     *
     * @return config
     **/
    @ApiModelProperty(example = "language: en pipeline: supervised_embeddings policies:   - name: MemoizationPolicy   - name: TEDPolicy", required = true, value = "Rasa config in plain text")

    public String getConfig() {
        return config;
    }


    public void setConfig(String config) {
        this.config = config;
    }


    public JSONTrainingRequest nlu(String nlu) {

        this.nlu = nlu;
        return this;
    }

    /**
     * Rasa NLU training data in YAML format
     *
     * @return nlu
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "- intent: greet   examples: |     - hey     - hello     - hi  - intent: goodbye   examples: |     - bye     - goodbye     - have a nice day     - see you  - intent: affirm   examples: |     - yes     - indeed  - intent: deny   examples: |     - no     - never  - intent: mood_great   examples: |     - perfect     - very good     - great  - intent: mood_unhappy   examples: |     - sad     - not good     - unhappy", value = "Rasa NLU training data in YAML format")

    public String getNlu() {
        return nlu;
    }


    public void setNlu(String nlu) {
        this.nlu = nlu;
    }


    public JSONTrainingRequest responses(String responses) {

        this.responses = responses;
        return this;
    }

    /**
     * Rasa response texts for retrieval intents in YAML format
     *
     * @return responses
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "chitchat/ask_name: - text: my name is Sara, Rasa's documentation bot! chitchat/ask_weather: - text: it's always sunny where I live", value = "Rasa response texts for retrieval intents in YAML format")

    public String getResponses() {
        return responses;
    }


    public void setResponses(String responses) {
        this.responses = responses;
    }


    public JSONTrainingRequest stories(String stories) {

        this.stories = stories;
        return this;
    }

    public JSONTrainingRequest out(String out) {

        this.out = out;
        return this;
    }

    public JSONTrainingRequest rules(String rules) {

        this.rules = rules;
        return this;
    }

    /**
     * Rasa Core stories in YAML format
     *
     * @return stories
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "- story: happy path   steps:   - intent: greet   - action: utter_greet   - intent: mood_great   - action: utter_happy  - story: sad path 1   steps:   - intent: greet   - action: utter_greet   - intent: mood_unhappy   - action: utter_cheer_up   - action: utter_did_that_help   - intent: affirm   - action: utter_happy  - story: sad path 2   steps:   - intent: greet   - action: utter_greet   - intent: mood_unhappy   - action: utter_cheer_up   - action: utter_did_that_help   - intent: deny   - action: utter_goodbye  - story: say goodbye   steps:   - intent: goodbye   - action: utter_goodbye", value = "Rasa Core stories in YAML format")

    public String getStories() {
        return stories;
    }


    public void setStories(String stories) {
        this.stories = stories;
    }

    public String getOut() {
        return out;
    }

    public void setOut(String out) {
        this.out = out;
    }

    public JSONTrainingRequest force(Boolean force) {

        this.force = force;
        return this;
    }

    /**
     * Force a model training even if the data has not changed
     *
     * @return force
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "false", value = "Force a model training even if the data has not changed")

    public Boolean getForce() {
        return force;
    }


    public void setForce(Boolean force) {
        this.force = force;
    }


    public JSONTrainingRequest saveToDefaultModelDirectory(Boolean saveToDefaultModelDirectory) {

        this.saveToDefaultModelDirectory = saveToDefaultModelDirectory;
        return this;
    }

    /**
     * If &#x60;true&#x60; (default) the trained model will be saved in the default model directory, if &#x60;false&#x60; it will be saved in a temporary directory
     *
     * @return saveToDefaultModelDirectory
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "If `true` (default) the trained model will be saved in the default model directory, if `false` it will be saved in a temporary directory")

    public Boolean getSaveToDefaultModelDirectory() {
        return saveToDefaultModelDirectory;
    }


    public void setSaveToDefaultModelDirectory(Boolean saveToDefaultModelDirectory) {
        this.saveToDefaultModelDirectory = saveToDefaultModelDirectory;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JSONTrainingRequest jsONTrainingRequest = (JSONTrainingRequest) o;
        return Objects.equals(this.domain, jsONTrainingRequest.domain) &&
                Objects.equals(this.config, jsONTrainingRequest.config) &&
                Objects.equals(this.nlu, jsONTrainingRequest.nlu) &&
                Objects.equals(this.responses, jsONTrainingRequest.responses) &&
                Objects.equals(this.stories, jsONTrainingRequest.stories) &&
                Objects.equals(this.force, jsONTrainingRequest.force) &&
                Objects.equals(this.saveToDefaultModelDirectory, jsONTrainingRequest.saveToDefaultModelDirectory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, config, nlu, responses, stories, force, saveToDefaultModelDirectory);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JSONTrainingRequest {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    nlu: ").append(toIndentedString(nlu)).append("\n");
        sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
        sb.append("    stories: ").append(toIndentedString(stories)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    force: ").append(toIndentedString(force)).append("\n");
        sb.append("    saveToDefaultModelDirectory: ").append(toIndentedString(saveToDefaultModelDirectory)).append("\n");
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

    @Override
    public Object getPayload() {
        String payload = "{\"domain\":\"" + domain + "\"," +
                "\"config\":\"" + config + "\"," +
                "\"nlu\":\"" + nlu + "\"," +
                "\"stories\":\"" + stories + "\"," +
                "\"responses\":\"" + responses + "\"," +
                "\"rules\":\"" + responses + "\" }";
        return this;
    }

    @Override
    public String getContentType() {
        return "application/json";
    }


}

