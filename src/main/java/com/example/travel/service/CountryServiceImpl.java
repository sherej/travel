package com.example.travel.service;

import com.example.travel.common.BaseMapper;
import com.example.travel.common.BaseRepository;
import com.example.travel.common.BaseServiceImpl;
import com.example.travel.dto.CountryDTO;
import com.example.travel.entity.Country;
import com.example.travel.mapper.CountryMapper;
import com.example.travel.repository.CountryRepository;
import com.example.travel.service.iservice.CountryService;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl extends BaseServiceImpl<Country, CountryDTO,Long> implements CountryService {
    private final CountryRepository repo;

    private final CountryMapper mapper;

    public CountryServiceImpl(CountryRepository repo, CountryMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    protected BaseRepository<Country, Long> getRepo() {
        return repo;
    }

    @Override
    protected BaseMapper<Country, CountryDTO> getMapper() {
        return mapper;
    }

}
