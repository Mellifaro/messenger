package com.softgroup.messenger.api.message.isTypingInChat;

import com.softgroup.common.protocol.RequestData;

/**
 * Created by Виктор on 30.03.2017.
 */
public class IsTypingInChatRequest implements RequestData {
    private static final long serialVersionUID = 2859298753071562625L;

    private String conversationId;

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }
}
