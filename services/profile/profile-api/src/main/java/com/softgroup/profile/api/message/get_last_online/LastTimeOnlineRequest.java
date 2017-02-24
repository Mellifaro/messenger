package com.softgroup.profile.api.message.get_last_online;

import com.softgroup.common.model.Profile;
import com.softgroup.common.protocol.RequestData;

import java.util.List;

/**
 * Created by Виктор on 23.02.2017.
 */
public class LastTimeOnlineRequest implements RequestData {
    private static final long serialVersionUID = 1662125620037293178L;

    private List<Profile> profileList;

    public List<Profile> getProfileList() {
        return profileList;
    }

    public void setProfileList(List<Profile> profileList) {
        this.profileList = profileList;
    }
}
