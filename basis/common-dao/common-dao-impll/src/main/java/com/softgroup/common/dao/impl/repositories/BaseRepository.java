package com.softgroup.common.dao.impl.repositories;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Виктор on 27.03.2017.
 */
@NoRepositoryBean
public interface BaseRepository<T> extends PagingAndSortingRepository<T, String>{
}
