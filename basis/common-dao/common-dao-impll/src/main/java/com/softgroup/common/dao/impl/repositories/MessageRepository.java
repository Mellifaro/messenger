package com.softgroup.common.dao.impl.repositories;

import com.softgroup.common.dao.api.entities.MessageEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Виктор on 17.03.2017.
 */
public interface MessageRepository extends PagingAndSortingRepository<MessageEntity, String>{
}
