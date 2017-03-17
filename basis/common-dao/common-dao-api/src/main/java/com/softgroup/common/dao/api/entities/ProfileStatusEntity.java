package com.softgroup.common.dao.api.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Виктор on 17.03.2017.
 */
@Entity
@Table(name = "profile_statuses")
public class ProfileStatusEntity implements Serializable{

    private static final long serialVersionUID = 408347519628170638L;

    @Id
    @Column(name = "profile_id")
    private String profileId;

    @Column(name = "is_online")
    private Boolean isOnline;

    @Column(name = "last_time_online")
    private Long lastTimeOnline;

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public Boolean getOnline() {
        return isOnline;
    }

    public void setOnline(Boolean online) {
        isOnline = online;
    }

    public Long getLastTimeOnline() {
        return lastTimeOnline;
    }

    public void setLastTimeOnline(Long lastTimeOnline) {
        this.lastTimeOnline = lastTimeOnline;
    }
}
