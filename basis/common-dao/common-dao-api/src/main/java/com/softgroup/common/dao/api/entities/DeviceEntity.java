package com.softgroup.common.dao.api.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Виктор on 18.03.2017.
 */
@Entity
@Table(name = "devices")
public class DeviceEntity implements Serializable{
    private static final long serialVersionUID = -506229924089552354L;

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "confirmation_time")
    private Long confirmTime;

    @ManyToOne
    @JoinColumn(name = "profile_id")
    private ProfileEntity profile;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Long confirmTime) {
        this.confirmTime = confirmTime;
    }

    public ProfileEntity getProfile() {
        return profile;
    }

    public void setProfile(ProfileEntity profile) {
        this.profile = profile;
    }
}
