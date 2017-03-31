package com.softgroup.messenger.api.message.getConversationsDetailsRequest;

import com.softgroup.common.protocol.RequestData;

import java.util.List;

/**
 * Created by Виктор on 30.03.2017.
 */
public class GetConversationsDetailsRequest implements RequestData {
    private static final long serialVersionUID = -3063431920617230758L;

    private List<String> conversationIds;

    public List<String> getConversationIds() {
        return conversationIds;
    }

    public void setConversationIds(List<String> conversationIds) {
        this.conversationIds = conversationIds;
    }
}
