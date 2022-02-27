package com.example.travel.service;

import com.example.travel.common.BaseMapper;
import com.example.travel.common.BaseRepository;
import com.example.travel.common.BaseServiceImpl;
import com.example.travel.dto.TourDTO;
import com.example.travel.entity.Tour;
import com.example.travel.mapper.TourMapper;
import com.example.travel.repository.TourRepository;
import com.example.travel.service.iservice.TourService;
import org.springframework.stereotype.Service;

@Service
public class TourServiceImpl extends BaseServiceImpl<Tour, TourDTO,Long> implements TourService {

    private final TourRepository repo;

    private final TourMapper mapper;

    public TourServiceImpl(TourRepository repo,TourMapper  mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    protected BaseRepository<Tour, Long> getRepo() {
        return repo;
    }

    @Override
    protected BaseMapper<Tour, TourDTO> getMapper() {
        return mapper;
    }
}
