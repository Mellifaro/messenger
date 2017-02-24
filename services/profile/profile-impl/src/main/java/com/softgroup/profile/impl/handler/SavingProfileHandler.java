package com.softgroup.profile.impl.handler;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.profile.api.message.set_my_profile.SavingProfileRequest;
import com.softgroup.profile.api.message.set_my_profile.SavingProfileResponse;
import com.softgroup.profile.api.router.ProfileRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 23.02.2017.
 */
@Component
public class SavingProfileHandler implements ProfileRequestHandler<SavingProfileRequest, SavingProfileResponse>{
    public String getName() {
        return "set_profile_settings";
    }

    public Response<SavingProfileResponse> handle(Request<SavingProfileRequest> msg) {
        return null;
    }
}
