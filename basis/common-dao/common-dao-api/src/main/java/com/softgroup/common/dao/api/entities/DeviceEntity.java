package com.softgroup.common.dao.api.entities;

import javax.persistence.*;

/**
 * Created by Виктор on 18.03.2017.
 */
@Entity
@Table(name = "devices")
public class DeviceEntity extends BaseEntity{
    private static final long serialVersionUID = -506229924089552354L;

    @Column(name = "confirmation_time")
    private Long confirmTime;

    @ManyToOne
    @JoinColumn(name = "profile_id")
    private ProfileEntity profile;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DeviceEntity)) return false;

        DeviceEntity that = (DeviceEntity) o;

        if (!confirmTime.equals(that.confirmTime)) return false;
        return profile.equals(that.profile);

    }

    @Override
    public int hashCode() {
        int result = confirmTime.hashCode();
        result = 31 * result + profile.hashCode();
        return result;
    }
}
