package com.sofrtgroup.messenger.api.message.update_convers_settings;

import com.softgroup.common.model.ConversationSettings;
import com.softgroup.common.protocol.RequestData;

/**
 * Created by Виктор on 24.02.2017.
 */
public class UpdConversSettingsRequest implements RequestData{
    private static final long serialVersionUID = 5300758146569404037L;

    private ConversationSettings settings;

    public ConversationSettings getSettings() {
        return settings;
    }

    public void setSettings(ConversationSettings settings) {
        this.settings = settings;
    }
}
