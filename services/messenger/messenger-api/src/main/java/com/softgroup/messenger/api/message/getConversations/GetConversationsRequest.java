package com.softgroup.messenger.api.message.getConversations;

import com.softgroup.common.protocol.RequestData;

/**
 * Created by Виктор on 30.03.2017.
 */
public class GetConversationsRequest implements RequestData {
    private static final long serialVersionUID = 4494776101317994862L;

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
