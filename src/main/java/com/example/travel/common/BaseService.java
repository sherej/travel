package com.example.travel.common;

import org.springframework.data.jpa.domain.Specification;

import java.util.List;
import java.util.Optional;

public interface BaseService<E,D,PK>{
    void save (D dto);

    Optional<E> findById(PK id);
    boolean  exists(PK id);
    Iterable<E> findAll();
    long count();
    void delete(PK id);
    List<E> findAll(Specification<E> spec);
}
