package com.softgroup.common.dao.impl.repositories;

import com.softgroup.common.dao.api.entities.ConversationEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Виктор on 17.03.2017.
 */
public interface ConversationRepository extends PagingAndSortingRepository<ConversationEntity, String>{
}
