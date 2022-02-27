package com.example.travel.repository;

import com.example.travel.common.BaseRepository;
import com.example.travel.entity.City;
import com.example.travel.entity.Company;
import com.example.travel.entity.Tour;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TourRepository extends BaseRepository<Tour,Long> {

//    List<Tour> findByCityAndOrganizer(City city, Company organizer);
}
