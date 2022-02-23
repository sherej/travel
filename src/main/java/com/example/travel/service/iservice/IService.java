package com.example.travel.service.iservice;

import java.util.List;

public interface IService<T> {
    T save(Long parentId,T object);
    T save(Long parentOneId,Long parentTwoId,T object);
    T save(Long parentOneId,Long parentTwoId,Long parentThreeId,T object);
    T save(T object);
    List<T> findByParentId(Long parentId);
    List<T> findByTwoParentId(Long parentOneId,Long parentTwoId);
//    List<T> findByThreeParentId(Long parentOneId,Long parentTwoId);
    T findById(Long id);
    List<T> getAll();
}
