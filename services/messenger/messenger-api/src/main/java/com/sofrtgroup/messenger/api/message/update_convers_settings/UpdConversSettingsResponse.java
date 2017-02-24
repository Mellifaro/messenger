package com.sofrtgroup.messenger.api.message.update_convers_settings;

import com.softgroup.common.model.ConversationSettings;
import com.softgroup.common.protocol.ResponseData;

/**
 * Created by Виктор on 24.02.2017.
 */
public class UpdConversSettingsResponse implements ResponseData{
    private static final long serialVersionUID = 4388887993041700655L;

    private ConversationSettings settings;

    public ConversationSettings getSettings() {
        return settings;
    }

    public void setSettings(ConversationSettings settings) {
        this.settings = settings;
    }
}
