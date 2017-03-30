package com.softgroup.messenger.api.message.getConversationsByIds;

import com.softgroup.common.protocol.RequestData;

import java.util.List;

/**
 * Created by Виктор on 30.03.2017.
 */
public class GetConversationsByIdsRequest implements RequestData {
    private static final long serialVersionUID = -6283329463974334708L;

    private List<String> conversatiodIds;

    public List<String> getConversatiodIds() {
        return conversatiodIds;
    }

    public void setConversatiodIds(List<String> conversatiodIds) {
        this.conversatiodIds = conversatiodIds;
    }
}
