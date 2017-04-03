package com.softgroup.common.dao.api.entities;

import javax.persistence.*;

/**
 * Created by Виктор on 03.04.2017.
 */
@Entity
@Table(name = "conversation_members")
public class ConversationMember {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id", nullable = false)
    private ProfileEntity profile;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "conversation_id", nullable = false)
    private ConversationEntity conversation;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private ConversationMemberStatus status;

    @Column(name = "join_date")
    private Long joinDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConversationMember)) return false;

        ConversationMember that = (ConversationMember) o;

        if (status != that.status) return false;
        return joinDate != null ? joinDate.equals(that.joinDate) : that.joinDate == null;

    }

    @Override
    public int hashCode() {
        int result = status.hashCode();
        result = 31 * result + (joinDate != null ? joinDate.hashCode() : 0);
        return result;
    }
}
