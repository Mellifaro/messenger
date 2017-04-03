package com.softgroup.messenger.api.message.updateConversationSettings;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.messenger.api.dto.ConversationSettings;

/**
 * Created by Виктор on 30.03.2017.
 */
public class UpdateConversationSettingsResponse implements ResponseData {
    private static final long serialVersionUID = -440800814626627636L;

    private ConversationSettings conversationSettings;

    public ConversationSettings getConversationSettings() {
        return conversationSettings;
    }

    public void setConversationSettings(ConversationSettings conversationSettings) {
        this.conversationSettings = conversationSettings;
    }
}
