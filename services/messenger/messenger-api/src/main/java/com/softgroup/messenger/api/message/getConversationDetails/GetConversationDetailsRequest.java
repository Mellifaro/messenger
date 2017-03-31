package com.softgroup.messenger.api.message.getConversationDetails;

import com.softgroup.common.protocol.RequestData;

/**
 * Created by Виктор on 30.03.2017.
 */
public class GetConversationDetailsRequest implements RequestData {
    private static final long serialVersionUID = 3540566523422151373L;

    private String conversationId;

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }
}
