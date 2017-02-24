package com.softgroup.profile.impl.handler;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.profile.api.message.get_my_profile.MyProfileRequest;
import com.softgroup.profile.api.message.get_my_profile.MyProfileResponse;
import com.softgroup.profile.api.router.ProfileRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 23.02.2017.
 */
@Component
public class ProfileSettingsHandler implements ProfileRequestHandler<MyProfileRequest, MyProfileResponse>{
    public String getName() {
        return "get_profile_settings";
    }

    public Response<MyProfileResponse> handle(Request<MyProfileRequest> msg) {
        return null;
    }
}
