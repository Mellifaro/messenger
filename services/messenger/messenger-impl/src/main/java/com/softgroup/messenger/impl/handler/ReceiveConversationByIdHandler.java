package com.softgroup.messenger.impl.handler;

import com.sofrtgroup.messenger.api.message.get_convers_by_id.ReceiveConversByIdRequest;
import com.sofrtgroup.messenger.api.message.get_convers_by_id.ReciveConversByIdResponse;
import com.sofrtgroup.messenger.api.router.MessengerRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;

/**
 * Created by Виктор on 24.02.2017.
 */
public class ReceiveConversationByIdHandler implements MessengerRequestHandler<ReceiveConversByIdRequest, ReciveConversByIdResponse> {
    public String getName() {
        return "get_conversations_by_ids";
    }

    public Response<ReciveConversByIdResponse> handle(Request<ReceiveConversByIdRequest> msg) {
        return null;
    }
}
