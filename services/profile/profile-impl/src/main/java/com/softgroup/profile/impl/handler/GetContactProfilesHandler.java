package com.softgroup.profile.impl.handler;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;
import com.softgroup.profile.api.message.getContactProfiles.ContactProfilesRequest;
import com.softgroup.profile.api.message.getContactProfiles.ContactProfilesResponse;
import com.softgroup.profile.api.router.ProfileRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 13.03.2017.
 */
@Component
public class GetContactProfilesHandler extends AbstractRequestHandler<ContactProfilesRequest, ContactProfilesResponse>
                                       implements ProfileRequestHandler {

    private static final String HANDLER_NAME = "get_contact_profiles";

    public String getName() {
        return HANDLER_NAME;
    }

    public Response<ContactProfilesResponse> handle(Request<?> msg) {
        return null;
    }
}
