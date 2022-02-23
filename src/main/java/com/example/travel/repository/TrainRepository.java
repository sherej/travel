package com.example.travel.repository;

import com.example.travel.entity.Airplane;
import com.example.travel.entity.Company;
import com.example.travel.entity.Train;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainRepository extends PagingAndSortingRepository<Train,Long>{
    List<Train> findAllByOwner(Company company);
}
