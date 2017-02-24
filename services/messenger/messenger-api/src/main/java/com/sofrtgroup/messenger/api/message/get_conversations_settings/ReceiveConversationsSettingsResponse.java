package com.sofrtgroup.messenger.api.message.get_conversations_settings;

import com.softgroup.common.model.ConversationSettings;
import com.softgroup.common.protocol.ResponseData;

import java.util.List;

/**
 * Created by Виктор on 24.02.2017.
 */
public class ReceiveConversationsSettingsResponse implements ResponseData{
    private static final long serialVersionUID = -4676456019110326743L;

    private List<ConversationSettings> settingsList;

    public List<ConversationSettings> getSettingsList() {
        return settingsList;
    }

    public void setSettingsList(List<ConversationSettings> settingsList) {
        this.settingsList = settingsList;
    }
}
