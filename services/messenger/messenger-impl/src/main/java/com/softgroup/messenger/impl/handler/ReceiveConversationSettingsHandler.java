package com.softgroup.messenger.impl.handler;

import com.sofrtgroup.messenger.api.message.get_convers_settings.ReceiveConversationSettingsRequest;
import com.sofrtgroup.messenger.api.message.get_convers_settings.ReceiveConversationSettingsResponse;
import com.sofrtgroup.messenger.api.router.MessengerRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;

/**
 * Created by Виктор on 24.02.2017.
 */
public class ReceiveConversationSettingsHandler implements MessengerRequestHandler<ReceiveConversationSettingsRequest, ReceiveConversationSettingsResponse>{
    public String getName() {
        return "get_conversation_settings";
    }

    public Response<ReceiveConversationSettingsResponse> handle(Request<ReceiveConversationSettingsRequest> msg) {
        return null;
    }
}
