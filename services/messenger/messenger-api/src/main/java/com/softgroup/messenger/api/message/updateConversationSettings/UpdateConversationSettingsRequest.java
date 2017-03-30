package com.softgroup.messenger.api.message.updateConversationSettings;

import com.softgroup.common.protocol.RequestData;
import com.softgroup.messenger.api.dto.ConversationSettings;

/**
 * Created by Виктор on 30.03.2017.
 */
public class UpdateConversationSettingsRequest implements RequestData {
    private static final long serialVersionUID = 4200484061026140993L;

    private ConversationSettings conversationSettings;

    public ConversationSettings getConversationSettings() {
        return conversationSettings;
    }

    public void setConversationSettings(ConversationSettings conversationSettings) {
        this.conversationSettings = conversationSettings;
    }
}
