package com.softgroup.messenger.impl.handler;

import com.sofrtgroup.messenger.api.message.get_convers_settings.ReceiveConversationSettingsResponse;
import com.sofrtgroup.messenger.api.message.get_conversations_settings.ReceiveConversationsSettingsRequest;
import com.sofrtgroup.messenger.api.router.MessengerRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;

/**
 * Created by Виктор on 24.02.2017.
 */
public class ReceiveConversationsSettingsHandler implements MessengerRequestHandler<ReceiveConversationsSettingsRequest, ReceiveConversationSettingsResponse> {
    public String getName() {
        return "get_conversations_settings";
    }

    public Response<ReceiveConversationSettingsResponse> handle(Request<ReceiveConversationsSettingsRequest> msg) {
        return null;
    }
}
