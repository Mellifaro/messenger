package com.softgroup.messenger.api.message.getConversationSettings;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.messenger.api.dto.ConversationSettings;

/**
 * Created by Виктор on 30.03.2017.
 */
public class GetConversationSettingsResponse implements ResponseData {
    private static final long serialVersionUID = 1940342313734916893L;

    private ConversationSettings conversationSettings;

    public ConversationSettings getConversationSettings() {
        return conversationSettings;
    }

    public void setConversationSettings(ConversationSettings conversationSettings) {
        this.conversationSettings = conversationSettings;
    }
}
