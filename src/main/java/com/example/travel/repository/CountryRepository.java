package com.example.travel.repository;

import com.example.travel.common.BaseRepository;
import com.example.travel.entity.Country;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends BaseRepository<Country,Long> {
}
