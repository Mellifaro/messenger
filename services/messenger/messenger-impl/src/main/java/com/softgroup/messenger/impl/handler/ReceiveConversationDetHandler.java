package com.softgroup.messenger.impl.handler;

import com.sofrtgroup.messenger.api.message.get_convers_details.ReceiveConversationDetRequest;
import com.sofrtgroup.messenger.api.message.get_convers_details.ReceiveConversationDetResponse;
import com.sofrtgroup.messenger.api.router.MessengerRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;

/**
 * Created by Виктор on 24.02.2017.
 */
public class ReceiveConversationDetHandler implements MessengerRequestHandler<ReceiveConversationDetRequest, ReceiveConversationDetResponse> {
    public String getName() {
        return "get_conversation_details";
    }

    public Response<ReceiveConversationDetResponse> handle(Request<ReceiveConversationDetRequest> msg) {
        return null;
    }
}
