package com.softgroup.common.dao.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Виктор on 17.03.2017.
 */
@Entity
@Table(name = "conversation_settings")
public class ConversationSettingsEntity implements Serializable {
    private static final long serialVersionUID = 7214265511617637837L;

    //TODO String or ConversEntity??
    @Id
    @Column(name = "conversation_id")
    private ConversationEntity conversation;

    @Column(name = "admin_id")
    private String adminId;

    @Column(name = "name")
    private String name;

    @Column(name = "logo_image_uri")
    private String logoImageUri;

    public ConversationEntity getConversation() {
        return conversation;
    }

    public void setConversation(ConversationEntity conversation) {
        this.conversation = conversation;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoImageUri() {
        return logoImageUri;
    }

    public void setLogoImageUri(String logoImageUri) {
        this.logoImageUri = logoImageUri;
    }
}
