package com.example.travel.service;

import com.example.travel.common.BaseMapper;
import com.example.travel.common.BaseRepository;
import com.example.travel.common.BaseServiceImpl;
import com.example.travel.dto.CityDTO;
import com.example.travel.entity.City;
import com.example.travel.mapper.CityMapper;
import com.example.travel.repository.CityRepository;
import com.example.travel.service.iservice.CityService;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl extends BaseServiceImpl<City, CityDTO,Long> implements CityService {
    private final CityRepository repo;

    private final CityMapper mapper;

    public CityServiceImpl(CityRepository repo,CityMapper  mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    protected BaseRepository<City, Long> getRepo() {
        return repo;
    }

    @Override
    protected BaseMapper<City,CityDTO > getMapper() {
        return mapper;
    }


}
