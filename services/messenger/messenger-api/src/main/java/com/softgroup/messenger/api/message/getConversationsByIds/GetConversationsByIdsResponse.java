package com.softgroup.messenger.api.message.getConversationsByIds;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.messenger.api.dto.Conversation;

import java.util.List;

/**
 * Created by Виктор on 30.03.2017.
 */
public class GetConversationsByIdsResponse implements ResponseData {
    private static final long serialVersionUID = 5118053558331845215L;

    private List<Conversation> conversationList;

    public List<Conversation> getConversationList() {
        return conversationList;
    }

    public void setConversationList(List<Conversation> conversationList) {
        this.conversationList = conversationList;
    }
}
