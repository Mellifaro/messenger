package com.softgroup.common.dao.impl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

/**
 * Created by Виктор on 18.03.2017.
 */
public abstract class AbstractEntityService<T extends Serializable> {

    @Autowired
    private CrudRepository<T, String> repository;

    public T findOne(String id){
        return repository.findOne(id);
    }

    public T save(T entity){
        return repository.save(entity);
    }

    public void delete(String id){
        repository.delete(id);
    }

    public Iterable<T> getAll(){
        return repository.findAll();
    }
}
