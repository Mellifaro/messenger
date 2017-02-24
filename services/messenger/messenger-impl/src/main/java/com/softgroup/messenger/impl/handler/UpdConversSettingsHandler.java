package com.softgroup.messenger.impl.handler;

import com.sofrtgroup.messenger.api.message.update_convers_settings.UpdConversSettingsRequest;
import com.sofrtgroup.messenger.api.message.update_convers_settings.UpdConversSettingsResponse;
import com.sofrtgroup.messenger.api.router.MessengerRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;

/**
 * Created by Виктор on 24.02.2017.
 */
public class UpdConversSettingsHandler implements MessengerRequestHandler<UpdConversSettingsRequest, UpdConversSettingsResponse>{
    public String getName() {
        return "update_conversation_settings";
    }

    public Response<UpdConversSettingsResponse> handle(Request<UpdConversSettingsRequest> msg) {
        return null;
    }
}
