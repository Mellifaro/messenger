package com.softgroup.common.dao.api.entities;

/**
 * Created by Виктор on 28.03.2017.
 */

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class BaseEntity implements Serializable{

    @Id
    @Column(name = "id")
    private String id;

    public BaseEntity() {
    }

    public BaseEntity(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
