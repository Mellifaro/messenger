package com.softgroup.messenger.impl.handler;

import com.sofrtgroup.messenger.api.message.get_convers.ReceiveConversRequest;
import com.sofrtgroup.messenger.api.message.get_convers.ReceiveConversResponse;
import com.sofrtgroup.messenger.api.router.MessengerRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;

/**
 * Created by Виктор on 24.02.2017.
 */
public class ReceiveConversationsHandler implements MessengerRequestHandler<ReceiveConversRequest, ReceiveConversResponse> {
    public String getName() {
        return "get_conversations";
    }

    public Response<ReceiveConversResponse> handle(Request<ReceiveConversRequest> msg) {
        return null;
    }
}
