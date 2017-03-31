package com.softgroup.messenger.api.message.messagesReadConfirmation;

import com.softgroup.common.protocol.RequestData;

import java.util.List;

/**
 * Created by Виктор on 30.03.2017.
 */
public class MessagesReadConfirmationRequest implements RequestData {
    private static final long serialVersionUID = -5927022349697030155L;

    private String conversationId;
    private List<String> messagesIdsList;

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public List<String> getMessagesIdsList() {
        return messagesIdsList;
    }

    public void setMessagesIdsList(List<String> messagesIdsList) {
        this.messagesIdsList = messagesIdsList;
    }
}
