package co.edu.uco.ucobet.ucobet_generales.crosscutting.messages;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.exception.CrosscuttingUcobetException;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.helpers.ObjectHelper;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.helpers.TextHelper;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.messages.enumerator.MessageCategory;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.messages.enumerator.MessageCode;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.messages.enumerator.MessageType;

public class Message {

    private MessageCode code;
    private MessageType type;
    private MessageCategory category;
    private String content;

    public Message(final MessageCode code, final MessageType type, final MessageCategory category, final String content) {
        setCode(code);
        setType(type);
        setCategory(category);
        setContent(content);
    }

    public static final Message create(final MessageCode code, final MessageType type, final MessageCategory category, final String content){
        return new Message(code, type, category, content);
    }

    public MessageCode getCode() {
        return code;
    }

    public void setCode(final MessageCode code) {
        if (ObjectHelper.isNull(code)){
            var userMessage = MessageCatalog.getMessageContent(MessageCode.M0000000004);
            var technicalMessage = MessageCatalog.getMessageContent(MessageCode.M0000000003);
            throw CrosscuttingUcobetException.create(userMessage, technicalMessage);
        }
        this.code = code;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(final MessageType type) {
        this.type = ObjectHelper.getDefault(type, MessageType.USER);
    }

    public MessageCategory getCategory() {
        return category;
    }

    public void setCategory(final MessageCategory category) {
        this.category = ObjectHelper.getDefault(category, MessageCategory.FATAL);
    }

    public String getContent() {
        return content;
    }

    public void setContent(final String content) {
        this.content = TextHelper.applyTrim(content);
    }
}
