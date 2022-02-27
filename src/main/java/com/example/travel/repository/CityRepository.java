package com.example.travel.repository;

import com.example.travel.common.BaseRepository;
import com.example.travel.entity.City;
import com.example.travel.entity.Country;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends BaseRepository<City,Long> {
//    List<City> findAllByCountry(Country country);

}
