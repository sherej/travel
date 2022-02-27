package com.example.travel.repository;

import com.example.travel.common.BaseRepository;
import com.example.travel.entity.Airplane;
import com.example.travel.entity.Company;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirplaneRepository extends BaseRepository<Airplane,Long> {
//    List<Airplane> findAllByOwner(Company company);

//    public Page<Airplane> findAll(Specification<Airplane> spec, Pageable pageable);
//
//    public List<Airplane> findAll(Specification<Airplane> spec);

}
