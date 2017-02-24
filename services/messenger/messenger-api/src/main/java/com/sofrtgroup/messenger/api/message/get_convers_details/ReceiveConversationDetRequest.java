package com.sofrtgroup.messenger.api.message.get_convers_details;

import com.softgroup.common.protocol.RequestData;

/**
 * Created by Виктор on 24.02.2017.
 */
public class ReceiveConversationDetRequest implements RequestData{
    private static final long serialVersionUID = -8900440008292818860L;

    private Integer conversId;

    public Integer getConversId() {
        return conversId;
    }

    public void setConversId(Integer conversId) {
        this.conversId = conversId;
    }
}
