package com.example.travel.common;

import org.springframework.data.jpa.domain.Specification;

import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<E,D,PK> implements BaseService<E,D,PK> {

    protected abstract BaseRepository<E,PK> getRepo();
    protected abstract BaseMapper<E,D> getMapper();



    @Override
    public void save(D dto) {
        getRepo().save(getMapper().toEntity(dto));
    }

    @Override
    public Optional<E> findById(PK id) {
        return getRepo().findById(id);
    }

    @Override
    public boolean exists(PK id) {
        return getRepo().existsById(id);
    }

    @Override
    public Iterable<E> findAll() {
        return getRepo().findAll();
    }

    @Override
    public long count() {
        return getRepo().count();
    }

    @Override
    public void delete(PK id) {
        getRepo().deleteById(id);
    }

    @Override
    public List<E> findAll(Specification<E> searchItem) {
        return getRepo().findAll(searchItem );
    }
}
