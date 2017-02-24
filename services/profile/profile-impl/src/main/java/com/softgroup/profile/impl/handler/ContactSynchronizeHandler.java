package com.softgroup.profile.impl.handler;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.profile.api.message.contact_sync.ContactSynchronizeRequest;
import com.softgroup.profile.api.message.contact_sync.ContactSynchronizeResponse;
import com.softgroup.profile.api.router.ProfileRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 23.02.2017.
 */
@Component
public class ContactSynchronizeHandler implements ProfileRequestHandler<ContactSynchronizeRequest, ContactSynchronizeResponse> {

    public String getName() {
        return "contacts_sync";
    }

    public Response<ContactSynchronizeResponse> handle(Request<ContactSynchronizeRequest> msg) {
        return null;
    }
}
