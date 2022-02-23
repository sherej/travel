package com.example.travel.repository;

import com.example.travel.entity.Airplane;
import com.example.travel.entity.Company;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirplaneRepository extends PagingAndSortingRepository<Airplane,Long>{
    List<Airplane> findAllByOwner(Company company);
}
