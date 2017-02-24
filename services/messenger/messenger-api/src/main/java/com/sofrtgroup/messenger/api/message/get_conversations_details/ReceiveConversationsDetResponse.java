package com.sofrtgroup.messenger.api.message.get_conversations_details;

import com.softgroup.common.model.ConversationDetails;
import com.softgroup.common.protocol.ResponseData;

import java.util.List;

/**
 * Created by Виктор on 24.02.2017.
 */
public class ReceiveConversationsDetResponse implements ResponseData{
    private static final long serialVersionUID = -1023623655947585084L;

    private List<ConversationDetails> detailsList;

    public List<ConversationDetails> getDetailsList() {
        return detailsList;
    }

    public void setDetailsList(List<ConversationDetails> detailsList) {
        this.detailsList = detailsList;
    }
}
