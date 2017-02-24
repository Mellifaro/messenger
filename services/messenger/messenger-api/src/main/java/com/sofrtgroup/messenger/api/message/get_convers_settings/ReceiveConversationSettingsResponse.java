package com.sofrtgroup.messenger.api.message.get_convers_settings;

import com.softgroup.common.model.ConversationSettings;
import com.softgroup.common.protocol.ResponseData;

/**
 * Created by Виктор on 24.02.2017.
 */
public class ReceiveConversationSettingsResponse implements ResponseData{
    private static final long serialVersionUID = 8323571058072938345L;

    private ConversationSettings conversSettings;

    public ConversationSettings getConversSettings() {
        return conversSettings;
    }

    public void setConversSettings(ConversationSettings conversSettings) {
        this.conversSettings = conversSettings;
    }
}
