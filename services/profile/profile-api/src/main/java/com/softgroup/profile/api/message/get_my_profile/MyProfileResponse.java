package com.softgroup.profile.api.message.get_my_profile;

import com.softgroup.common.model.Profile;
import com.softgroup.common.protocol.ResponseData;

/**
 * Created by Виктор on 23.02.2017.
 */
public class MyProfileResponse implements ResponseData {
    private static final long serialVersionUID = 3339208016668486155L;

    private Profile myProfile;

    public Profile getMyProfile() {
        return myProfile;
    }

    public void setMyProfile(Profile myProfile) {
        this.myProfile = myProfile;
    }
}
