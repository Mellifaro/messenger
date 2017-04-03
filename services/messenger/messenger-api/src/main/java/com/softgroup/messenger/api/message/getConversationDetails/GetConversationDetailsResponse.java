package com.softgroup.messenger.api.message.getConversationDetails;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.messenger.api.dto.ConversationDetails;

/**
 * Created by Виктор on 30.03.2017.
 */
public class GetConversationDetailsResponse implements ResponseData {
    private static final long serialVersionUID = -221485817245248527L;

    private ConversationDetails conversationDetails;

    public ConversationDetails getConversationDetails() {
        return conversationDetails;
    }

    public void setConversationDetails(ConversationDetails conversationDetails) {
        this.conversationDetails = conversationDetails;
    }
}
