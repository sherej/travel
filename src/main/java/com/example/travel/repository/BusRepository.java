package com.example.travel.repository;

import com.example.travel.common.BaseRepository;
import com.example.travel.entity.Airplane;
import com.example.travel.entity.Bus;
import com.example.travel.entity.Company;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusRepository extends BaseRepository<Bus,Long> {
//    List<Bus> findAllByOwner(Company company);
}
