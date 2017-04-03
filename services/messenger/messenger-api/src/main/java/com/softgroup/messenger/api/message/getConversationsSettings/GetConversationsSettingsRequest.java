package com.softgroup.messenger.api.message.getConversationsSettings;

import com.softgroup.common.protocol.RequestData;

import java.util.List;

/**
 * Created by Виктор on 30.03.2017.
 */
public class GetConversationsSettingsRequest implements RequestData {
    private static final long serialVersionUID = 9126637678980415478L;

    private List<String> conversationIds;

    public List<String> getConversationIds() {
        return conversationIds;
    }

    public void setConversationIds(List<String> conversationIds) {
        this.conversationIds = conversationIds;
    }
}
