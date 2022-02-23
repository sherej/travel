package com.example.travel.repository;

import com.example.travel.entity.TravelSchedule;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TravelScheduleRepository extends PagingAndSortingRepository<TravelSchedule,Long>{
}
