package com.sofrtgroup.messenger.api.message.get_conversations_settings;

import com.softgroup.common.protocol.RequestData;

import java.util.List;

/**
 * Created by Виктор on 24.02.2017.
 */
public class ReceiveConversationsSettingsRequest implements RequestData{
    private static final long serialVersionUID = 9207806649643518737L;

    private List<Integer> conversationsListId;

    public List<Integer> getConversationsListId() {
        return conversationsListId;
    }

    public void setConversationsListId(List<Integer> conversationsListId) {
        this.conversationsListId = conversationsListId;
    }
}
