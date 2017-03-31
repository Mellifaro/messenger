package com.softgroup.messenger.api.message.getConversationsSettings;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.messenger.api.dto.ConversationSettings;

import java.util.List;

/**
 * Created by Виктор on 30.03.2017.
 */
public class GetConversationsSettingsResponse implements ResponseData {
    private static final long serialVersionUID = -7566568745083394992L;

    private List<ConversationSettings> conversationSettingsList;

    public List<ConversationSettings> getConversationSettingsList() {
        return conversationSettingsList;
    }

    public void setConversationSettingsList(List<ConversationSettings> conversationSettingsList) {
        this.conversationSettingsList = conversationSettingsList;
    }
}
