package com.softgroup.profile.api.message.set_my_profile;

import com.softgroup.common.model.ProfileSettings;
import com.softgroup.common.protocol.RequestData;

/**
 * Created by Виктор on 23.02.2017.
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
