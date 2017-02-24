package com.softgroup.profile.impl.handler;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.profile.api.message.get_profile_settings.ProfileSettingsRequest;
import com.softgroup.profile.api.message.get_profile_settings.ProfileSettingsResponse;
import com.softgroup.profile.api.router.ProfileRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 23.02.2017.
 */
@Component
public class ReceiveMyProfileHandler implements ProfileRequestHandler<ProfileSettingsRequest, ProfileSettingsResponse>{

    public String getName() {
        return "get_profile_settings";
    }

    public Response<ProfileSettingsResponse> handle(Request<ProfileSettingsRequest> msg) {
        return null;
    }
}
