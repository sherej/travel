package com.example.travel.repository;

import com.example.travel.entity.Passenger;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PassengerRepository extends PagingAndSortingRepository<Passenger,Long> {
}
