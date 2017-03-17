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
@Table(name = "messages")
public class MessageEntity implements Serializable{

    private static final long serialVersionUID = -5413393731385827363L;

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "sender_id")
    private String sender_id;

    @Column(name = "conversation_id")
    private String conversationId;

    @Column(name = "message_type")
    private Integer messageType;

    @Column(name = "payload")
    private String payload;

    @Column(name = "status")
    private Integer status;

    @Column(name = "create_time")
    private Long createTime;

    @Column(name = "server_receive_time")
    private Long serverReceiveTime;

    @Column(name = "message_index")
    private Long messageIndex;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSender_id() {
        return sender_id;
    }

    public void setSender_id(String sender_id) {
        this.sender_id = sender_id;
    }

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public Integer getMessageType() {
        return messageType;
    }

    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getServerReceiveTime() {
        return serverReceiveTime;
    }

    public void setServerReceiveTime(Long serverReceiveTime) {
        this.serverReceiveTime = serverReceiveTime;
    }

    public Long getMessageIndex() {
        return messageIndex;
    }

    public void setMessageIndex(Long messageIndex) {
        this.messageIndex = messageIndex;
    }
}
