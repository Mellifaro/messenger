package com.softgroup.common.dao.api.entities;

import javax.persistence.*;

/**
 * Created by Виктор on 03.04.2017.
 */
@Entity
@Table(name = "conversations")
public class ConversationEntity extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private ConversationType type;

    @Column(name = "last_message_time")
    private Long lastMessageTime;

    @Column(name = "created_time")
    private Long createdTime;

    public ConversationType getType() {
        return type;
    }

    public void setType(ConversationType type) {
        this.type = type;
    }

    public Long getLastMessageTime() {
        return lastMessageTime;
    }

    public void setLastMessageTime(Long lastMessageTime) {
        this.lastMessageTime = lastMessageTime;
    }

    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConversationEntity)) return false;

        ConversationEntity that = (ConversationEntity) o;

        if (type != that.type) return false;
        if (lastMessageTime != null ? !lastMessageTime.equals(that.lastMessageTime) : that.lastMessageTime != null)
            return false;
        return createdTime.equals(that.createdTime);

    }

    @Override
    public int hashCode() {
        int result = type.hashCode();
        result = 31 * result + (lastMessageTime != null ? lastMessageTime.hashCode() : 0);
        result = 31 * result + createdTime.hashCode();
        return result;
    }
}
