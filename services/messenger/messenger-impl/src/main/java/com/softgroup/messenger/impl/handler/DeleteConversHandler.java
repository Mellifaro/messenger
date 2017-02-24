package com.softgroup.messenger.impl.handler;

import com.sofrtgroup.messenger.api.message.delete_convers.DeleteConversRequest;
import com.sofrtgroup.messenger.api.message.delete_convers.DeleteConversResponse;
import com.sofrtgroup.messenger.api.router.MessengerRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;

/**
 * Created by Виктор on 24.02.2017.
 */
public class DeleteConversHandler implements MessengerRequestHandler<DeleteConversRequest, DeleteConversResponse>{
    public String getName() {
        return "delete_conversation";
    }

    public Response<DeleteConversResponse> handle(Request<DeleteConversRequest> msg) {
        return null;
    }
}
