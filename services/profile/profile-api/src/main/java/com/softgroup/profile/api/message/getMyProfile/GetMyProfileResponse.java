package com.softgroup.profile.api.message.getMyProfile;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.profile.api.model.Profile;

/**
 * Created by Виктор on 13.03.2017.
 */
public class GetMyProfileResponse implements ResponseData {
    private static final long serialVersionUID = 3339208016668486155L;

    private Profile myProfile;

    public Profile getMyProfile() {
        return myProfile;
    }

    public void setMyProfile(Profile myProfile) {
        this.myProfile = myProfile;
    }
}
