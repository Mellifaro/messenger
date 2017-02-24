package com.sofrtgroup.messenger.api.message.get_convers;

import com.softgroup.common.model.ConversationType;
import com.softgroup.common.protocol.RequestData;

/**
 * Created by Виктор on 24.02.2017.
 */
public class ReceiveConversRequest implements RequestData{
    private static final long serialVersionUID = -5231059874473591766L;

    private ConversationType conversationType;

    public ConversationType getConversationType() {
        return conversationType;
    }

    public void setConversationType(ConversationType conversationType) {
        this.conversationType = conversationType;
    }
}
