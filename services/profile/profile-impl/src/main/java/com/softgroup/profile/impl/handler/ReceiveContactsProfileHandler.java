package com.softgroup.profile.impl.handler;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.profile.api.message.get_cont_profiles.ContactsProfileRequest;
import com.softgroup.profile.api.message.get_cont_profiles.ContactsProfileResponse;
import com.softgroup.profile.api.router.ProfileRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 23.02.2017.
 */
@Component
public class ReceiveContactsProfileHandler implements ProfileRequestHandler<ContactsProfileRequest, ContactsProfileResponse> {
    public String getName() {
        return "get_contact_profiles";
    }

    public Response<ContactsProfileResponse> handle(Request<ContactsProfileRequest> msg) {
        return null;
    }
}
