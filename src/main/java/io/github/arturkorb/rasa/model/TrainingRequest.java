package io.github.arturkorb.rasa.model;

public interface TrainingRequest {
    public Object getPayload();

    public String getContentType();
}
