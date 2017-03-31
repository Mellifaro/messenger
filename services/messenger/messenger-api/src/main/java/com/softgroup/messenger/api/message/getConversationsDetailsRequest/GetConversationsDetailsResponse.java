package com.softgroup.messenger.api.message.getConversationsDetailsRequest;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.messenger.api.dto.ConversationDetails;

import java.util.List;

/**
 * Created by Виктор on 30.03.2017.
 */
public class GetConversationsDetailsResponse implements ResponseData {
    private static final long serialVersionUID = -8767181115363431977L;

    private List<ConversationDetails> conversationDetailsList;

    public List<ConversationDetails> getConversationDetailsList() {
        return conversationDetailsList;
    }

    public void setConversationDetailsList(List<ConversationDetails> conversationDetailsList) {
        this.conversationDetailsList = conversationDetailsList;
    }
}
