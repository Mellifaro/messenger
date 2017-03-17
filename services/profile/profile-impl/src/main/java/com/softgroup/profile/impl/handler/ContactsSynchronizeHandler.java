package com.softgroup.profile.impl.handler;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;
import com.softgroup.profile.api.message.contactSync.ContactSyncRequest;
import com.softgroup.profile.api.message.contactSync.ContactSyncResponse;
import com.softgroup.profile.api.router.ProfileRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 13.03.2017.
 */
@Component
public class ContactsSynchronizeHandler extends AbstractRequestHandler<ContactSyncRequest, ContactSyncResponse>
                                        implements ProfileRequestHandler {

    private static final String HANDLER_NAME = "contacts_sync";

    public String getName() {
        return HANDLER_NAME;
    }

    public Response<ContactSyncResponse> handle(Request<?> msg) {
        return null;
    }
}
