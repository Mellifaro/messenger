package com.softgroup.common.dao.api.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Виктор on 17.03.2017.
 */
@Entity
@Table(name = "profiles")
public class ProfileEntity extends BaseEntity {
    private static final long serialVersionUID = 2645460488213358603L;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "create_date_time")
    private Long createDateTime;

    @Column(name = "update_date_time")
    private Long updateDateTime;

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private String status;

    @Column(name = "avatar_uri")
    private String avatarUri;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "profile")
    private List<ProfileSettingsEntity> settingsEntities;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Long createDateTime) {
        this.createDateTime = createDateTime;
    }

    public Long getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(Long updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAvatarUri() {
        return avatarUri;
    }

    public void setAvatarUri(String avatarUri) {
        this.avatarUri = avatarUri;
    }

    public List<ProfileSettingsEntity> getSettingsEntities() {
        return settingsEntities;
    }

    public void setSettingsEntities(List<ProfileSettingsEntity> settingsEntities) {
        this.settingsEntities = settingsEntities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProfileEntity that = (ProfileEntity) o;

        if (!getId().equals(that.getId())) return false;
        if (!phoneNumber.equals(that.phoneNumber)) return false;
        if (!createDateTime.equals(that.createDateTime)) return false;
        if (!updateDateTime.equals(that.updateDateTime)) return false;
        if (!name.equals(that.name)) return false;
        if (!status.equals(that.status)) return false;
        return avatarUri.equals(that.avatarUri);
    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + phoneNumber.hashCode();
        result = 31 * result + createDateTime.hashCode();
        result = 31 * result + updateDateTime.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + status.hashCode();
        result = 31 * result + avatarUri.hashCode();
        return result;
    }
}