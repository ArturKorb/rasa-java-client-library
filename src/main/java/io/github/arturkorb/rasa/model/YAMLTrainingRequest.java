package io.github.arturkorb.rasa.model;

import com.google.gson.annotations.SerializedName;

public class YAMLTrainingRequest implements TrainingRequest {


    public static final String SERIALIZED_NAME_CONFIG = "config";
    @SerializedName(SERIALIZED_NAME_CONFIG)
    private String config;

    public static final String SERIALIZED_NAME_NLU = "nlu";
    @SerializedName(SERIALIZED_NAME_NLU)
    private String nlu;

    public static final String SERIALIZED_NAME_STORIES = "stories";
    @SerializedName(SERIALIZED_NAME_STORIES)
    private String stories;

    public static final String SERIALIZED_NAME_RULES = "rules";
    @SerializedName(SERIALIZED_NAME_RULES)
    private String rules;

    public static final String SERIALIZED_NAME_DOMAIN = "domain";
    @SerializedName(SERIALIZED_NAME_DOMAIN)
    private String domain;

    public static final String SERIALIZED_NAME_RESPONSES = "responses";
    @SerializedName(SERIALIZED_NAME_RESPONSES)
    private String responses;

    public YAMLTrainingRequest() {
        this.stories = "";
        this.nlu = "";
        this.domain = "";
        this.config = "";
        this.rules = "";
        this.responses = "";
    }

    public YAMLTrainingRequest nlu(String nlu) {

        this.nlu = nlu;
        return this;
    }

    public YAMLTrainingRequest stories(String stories) {

        this.stories = stories;
        return this;
    }

    public YAMLTrainingRequest rules(String rules) {

        this.rules = rules;
        return this;
    }

    public YAMLTrainingRequest config(String config) {

        this.config = config;
        return this;
    }

    public YAMLTrainingRequest domain(String domain) {

        this.domain = domain;
        return this;
    }

    public YAMLTrainingRequest responses(String responses) {

        this.responses = responses;
        return this;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public String getNlu() {
        return nlu;
    }

    public void setNlu(String nlu) {
        this.nlu = nlu;
    }

    public String getStories() {
        return stories;
    }

    public void setStories(String stories) {
        this.stories = stories;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getResponses() {
        return responses;
    }

    public void setResponses(String responses) {
        this.responses = responses;
    }

    @Override
    public String getPayload() {
        return config + "\n" + domain + "\n" + nlu + "\n" + stories + "\n" + responses + "\n" + rules;
    }

    @Override
    public String getContentType() {
        return "application/x-yaml";
    }
}
