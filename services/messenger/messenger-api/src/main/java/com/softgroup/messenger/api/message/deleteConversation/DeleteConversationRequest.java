package com.softgroup.messenger.api.message.deleteConversation;

import com.softgroup.common.protocol.RequestData;

/**
 * Created by Виктор on 30.03.2017.
 */
public class DeleteConversationRequest implements RequestData {
    private static final long serialVersionUID = -5366291359963643816L;

    private String conversationId;

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }
}
