package com.sofrtgroup.messenger.api.message.get_convers_details;

import com.softgroup.common.model.ConversationDetails;
import com.softgroup.common.protocol.ResponseData;

/**
 * Created by Виктор on 24.02.2017.
 */
public class ReceiveConversationDetResponse implements ResponseData{
    private static final long serialVersionUID = -6276020356502647443L;

    private ConversationDetails convDetails;

    public ConversationDetails getConvDetails() {
        return convDetails;
    }

    public void setConvDetails(ConversationDetails convDetails) {
        this.convDetails = convDetails;
    }
}
