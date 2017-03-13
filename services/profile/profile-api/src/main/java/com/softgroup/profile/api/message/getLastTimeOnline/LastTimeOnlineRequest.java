package com.softgroup.profile.api.message.getLastTimeOnline;

import com.softgroup.common.protocol.RequestData;
import com.softgroup.profile.api.model.Profile;

import java.util.List;

/**
 * Created by Виктор on 13.03.2017.
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