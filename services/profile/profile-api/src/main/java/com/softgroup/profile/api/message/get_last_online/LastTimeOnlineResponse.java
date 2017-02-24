package com.softgroup.profile.api.message.get_last_online;

import com.softgroup.common.model.ProfileStatus;
import com.softgroup.common.protocol.ResponseData;

import java.util.List;

/**
 * Created by Виктор on 23.02.2017.
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
