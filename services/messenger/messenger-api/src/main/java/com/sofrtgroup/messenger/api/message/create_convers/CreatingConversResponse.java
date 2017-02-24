package com.sofrtgroup.messenger.api.message.create_convers;

import com.softgroup.common.model.Conversation;
import com.softgroup.common.protocol.ResponseData;

/**
 * Created by Виктор on 24.02.2017.
 */
public class CreatingConversResponse implements ResponseData{
    private static final long serialVersionUID = -9115823695044516832L;

    private Conversation conversation;

    public Conversation getConversation() {
        return conversation;
    }

    public void setConversation(Conversation conversation) {
        this.conversation = conversation;
    }
}
