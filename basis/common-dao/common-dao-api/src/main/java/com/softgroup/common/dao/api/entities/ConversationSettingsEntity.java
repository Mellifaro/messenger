package com.softgroup.common.dao.api.entities;

import javax.persistence.*;

/**
 * Created by Виктор on 03.04.2017.
 */
@Entity
@Table(name = "conversation_settings")
public class ConversationSettingsEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "admin_id", nullable = false)
    private ProfileEntity admin;

    @Column(name = "name")
    private String name;

    @Column(name = "logo_URL")
    private String logoURL;

    @OneToOne(fetch = FetchType.LAZY)
    private ConversationEntity conversation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoURL() {
        return logoURL;
    }

    public void setLogoURL(String logoURL) {
        this.logoURL = logoURL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConversationSettingsEntity)) return false;

        ConversationSettingsEntity that = (ConversationSettingsEntity) o;

        if (!name.equals(that.name)) return false;
        return logoURL.equals(that.logoURL);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + logoURL.hashCode();
        return result;
    }
}
