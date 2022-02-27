package com.example.travel.repository;

import com.example.travel.common.BaseRepository;
import com.example.travel.entity.Company;
import com.example.travel.entity.Train;
import com.example.travel.entity.Vehicle;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends BaseRepository<Vehicle,Long> {
//    List<Vehicle> findAllByOwner(Company company);
}
