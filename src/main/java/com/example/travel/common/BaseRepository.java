package com.example.travel.common;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

@NoRepositoryBean
public interface BaseRepository<E,PK> extends PagingAndSortingRepository<E,PK>, JpaSpecificationExecutor<E> {
    public Page<E> findAll(Specification<E> spec, Pageable pageable);

    public List<E> findAll(Specification<E> spec);
}
