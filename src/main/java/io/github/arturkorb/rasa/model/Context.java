package io.github.arturkorb.rasa.model;

import java.util.Map;

public class Context {

    private BotAnswer botAnswer;
    private ParseResult parseResult;
    private Map<String, SlotDescription> slots;
    private UserMessage userMessage;
    private LatestAction latestAction;

    public Context() {
    }

    public BotAnswer getBotAnswer() {
        return botAnswer;
    }

    public void setBotAnswer(BotAnswer botAnswer) {
        this.botAnswer = botAnswer;
    }

    public ParseResult getParseResult() {
        return parseResult;
    }

    public void setParseResult(ParseResult parseResult) {
        this.parseResult = parseResult;
    }

    public Map<String, SlotDescription> getSlots() {
        return slots;
    }

    public void setSlots(Map<String, SlotDescription> slots) {
        this.slots = slots;
    }

    public UserMessage getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(UserMessage userMessage) {
        this.userMessage = userMessage;
    }

    public LatestAction getLatestAction() {
        return latestAction;
    }

    public void setLatestAction(LatestAction latestAction) {
        this.latestAction = latestAction;
    }
}
