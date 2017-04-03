package com.softgroup.messenger.api.message.createConversation;

import com.softgroup.common.protocol.RequestData;

import java.util.List;

/**
 * Created by Виктор on 30.03.2017.
 */
public class CreateConversationRequest implements RequestData {
    private static final long serialVersionUID = 562447604711248906L;

    private String type;
    private List<String> membersIds;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getMembersIds() {
        return membersIds;
    }

    public void setMembersIds(List<String> membersIds) {
        this.membersIds = membersIds;
    }
}
