package com.softgroup.messenger.api.message.createConversation;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.messenger.api.dto.Conversation;

/**
 * Created by Виктор on 30.03.2017.
 */
public class CreateConversationResponse implements ResponseData {
    private static final long serialVersionUID = 3355721749154968234L;

    private Conversation conversation;

    public Conversation getConversation() {
        return conversation;
    }

    public void setConversation(Conversation conversation) {
        this.conversation = conversation;
    }
}
