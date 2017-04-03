package com.softgroup.messenger.api.message.getConversationSettings;

import com.softgroup.common.protocol.RequestData;

/**
 * Created by Виктор on 30.03.2017.
 */
public class GetConversationSettingsRequest implements RequestData {
    private static final long serialVersionUID = 7555189929406796523L;

    private String coversationId;

    public String getCoversationId() {
        return coversationId;
    }

    public void setCoversationId(String coversationId) {
        this.coversationId = coversationId;
    }
}
