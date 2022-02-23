package com.example.travel.repository;

import com.example.travel.entity.City;
import com.example.travel.entity.Company;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends PagingAndSortingRepository<Company,Long>{
    List<Company> findAllByCity(City city);
}
