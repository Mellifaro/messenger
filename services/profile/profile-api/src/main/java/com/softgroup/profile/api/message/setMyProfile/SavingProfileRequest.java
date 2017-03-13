package com.softgroup.profile.api.message.setMyProfile;

import com.softgroup.common.protocol.RequestData;
import com.softgroup.profile.api.model.ProfileSettings;

/**
 * Created by Виктор on 13.03.2017.
 */
public class SavingProfileRequest implements RequestData {
    private static final long serialVersionUID = 6143955119092926783L;

    private ProfileSettings settings;

    public ProfileSettings getSettings() {
        return settings;
    }

    public void setSettings(ProfileSettings settings) {
        this.settings = settings;
    }
}
