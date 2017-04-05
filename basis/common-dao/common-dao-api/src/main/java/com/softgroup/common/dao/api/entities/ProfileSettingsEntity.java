package com.softgroup.common.dao.api.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Виктор on 17.03.2017.
 */
@Entity
@Table(name = "profile_settings")
public class ProfileSettingsEntity extends BaseEntity {

    private static final long serialVersionUID = 2645460488213358603L;

    @Column(name = "settings_data")
    private String settingsData;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id", nullable = false)
    private ProfileEntity profile;

    public String getSettingsData() {
        return settingsData;
    }

    public void setSettingsData(String settingsData) {
        this.settingsData = settingsData;
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
        if (o == null || getClass() != o.getClass()) return false;

        ProfileSettingsEntity that = (ProfileSettingsEntity) o;

        if (!getId().equals(that.getId())) return false;
        return settingsData.equals(that.settingsData);
    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + settingsData.hashCode();
        return result;
    }
}