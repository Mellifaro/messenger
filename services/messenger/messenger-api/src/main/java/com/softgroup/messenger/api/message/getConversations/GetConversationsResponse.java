package com.softgroup.messenger.api.message.getConversations;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.messenger.api.dto.Conversation;

import java.util.List;

/**
 * Created by Виктор on 30.03.2017.
 */
public class GetConversationsResponse implements ResponseData {
    private static final long serialVersionUID = 7330895438568162959L;

    private List<Conversation> conversationList;

    public List<Conversation> getConversationList() {
        return conversationList;
    }

    public void setConversationList(List<Conversation> conversationList) {
        this.conversationList = conversationList;
    }
}
