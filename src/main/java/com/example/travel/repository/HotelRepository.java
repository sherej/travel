package com.example.travel.repository;

import com.example.travel.entity.City;
import com.example.travel.entity.Company;
import com.example.travel.entity.Hotel;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends PagingAndSortingRepository<Hotel,Long>{
    List<Hotel> findAllByCity(City city);
}
