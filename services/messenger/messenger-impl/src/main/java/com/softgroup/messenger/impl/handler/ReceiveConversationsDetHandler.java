package com.softgroup.messenger.impl.handler;

import com.sofrtgroup.messenger.api.message.get_conversations_details.ReceiveConversationsDetRequest;
import com.sofrtgroup.messenger.api.message.get_conversations_details.ReceiveConversationsDetResponse;
import com.sofrtgroup.messenger.api.router.MessengerRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;

/**
 * Created by Виктор on 24.02.2017.
 */
public class ReceiveConversationsDetHandler implements MessengerRequestHandler<ReceiveConversationsDetRequest, ReceiveConversationsDetResponse> {
    public String getName() {
        return "get_conversations_details";
    }

    public Response<ReceiveConversationsDetResponse> handle(Request<ReceiveConversationsDetRequest> msg) {
        return null;
    }
}
