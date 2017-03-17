package com.softgroup.profile.impl.handler;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;
import com.softgroup.profile.api.message.setMyProfile.SetProfileRequest;
import com.softgroup.profile.api.message.setMyProfile.SetProfileResponse;
import com.softgroup.profile.api.router.ProfileRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 13.03.2017.
 */
@Component
public class SetMyProfileHandler extends AbstractRequestHandler<SetProfileRequest, SetProfileResponse>
                                 implements ProfileRequestHandler {

    private static final String HANDLER_NAME = "set_my_profile";

    public String getName() {
        return HANDLER_NAME;
    }

    public Response<SetProfileResponse> handle(Request<?> msg) {
        return null;
    }
}
