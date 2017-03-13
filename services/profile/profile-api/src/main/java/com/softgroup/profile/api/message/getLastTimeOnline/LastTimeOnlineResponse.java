package com.softgroup.profile.api.message.getLastTimeOnline;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.profile.api.model.ProfileStatus;

import java.util.List;

/**
 * Created by Виктор on 13.03.2017.
 */
public class LastTimeOnlineResponse implements ResponseData {
    private static final long serialVersionUID = 2588010261803808427L;

    private List<ProfileStatus> statuses;

    public List<ProfileStatus> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<ProfileStatus> statuses) {
        this.statuses = statuses;
    }
}