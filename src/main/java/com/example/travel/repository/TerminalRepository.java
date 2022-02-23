package com.example.travel.repository;

import com.example.travel.entity.City;
import com.example.travel.entity.Company;
import com.example.travel.entity.Terminal;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TerminalRepository extends PagingAndSortingRepository<Terminal,Long>{
    List<Terminal> findAllByCity(City city);
}
