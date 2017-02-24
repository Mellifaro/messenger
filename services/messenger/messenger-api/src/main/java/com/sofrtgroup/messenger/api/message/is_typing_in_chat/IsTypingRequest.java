package com.sofrtgroup.messenger.api.message.is_typing_in_chat;

import com.softgroup.common.protocol.RequestData;

/**
 * Created by Виктор on 24.02.2017.
 */
public class IsTypingRequest implements RequestData {
    private static final long serialVersionUID = 4415906454916663601L;

    private Integer conversId;

    public Integer getConversId() {
        return conversId;
    }

    public void setConversId(Integer conversId) {
        this.conversId = conversId;
    }
}
