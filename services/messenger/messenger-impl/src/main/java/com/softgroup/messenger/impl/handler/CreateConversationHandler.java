package com.softgroup.messenger.impl.handler;

import com.sofrtgroup.messenger.api.message.create_convers.CreatingConversRequest;
import com.sofrtgroup.messenger.api.message.create_convers.CreatingConversResponse;
import com.sofrtgroup.messenger.api.router.MessengerRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;

/**
 * Created by Виктор on 24.02.2017.
 */
public class CreateConversationHandler implements MessengerRequestHandler<CreatingConversRequest, CreatingConversResponse> {
    public String getName() {
        return "create_conversation";
    }

    public Response<CreatingConversResponse> handle(Request<CreatingConversRequest> msg) {
        return null;
    }
}
