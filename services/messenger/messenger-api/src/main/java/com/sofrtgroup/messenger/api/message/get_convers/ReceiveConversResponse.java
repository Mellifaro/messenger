package com.sofrtgroup.messenger.api.message.get_convers;

import com.softgroup.common.model.Conversation;
import com.softgroup.common.protocol.ResponseData;

import java.util.List;

/**
 * Created by Виктор on 24.02.2017.
 */
public class ReceiveConversResponse implements ResponseData {
    private static final long serialVersionUID = 2266822528685959219L;

    private List<Conversation> conversationList;

    public List<Conversation> getConversationList() {
        return conversationList;
    }

    public void setConversationList(List<Conversation> conversationList) {
        this.conversationList = conversationList;
    }
}
