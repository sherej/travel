package com.example.travel.service;


import com.example.travel.common.BaseMapper;
import com.example.travel.common.BaseRepository;
import com.example.travel.common.BaseServiceImpl;
import com.example.travel.dto.TrainDTO;
import com.example.travel.entity.Train;

import com.example.travel.mapper.TrainMapper;
import com.example.travel.repository.TrainRepository;
import com.example.travel.service.iservice.TrainService;
import org.springframework.stereotype.Service;

@Service
public class TrainServiceImpl extends BaseServiceImpl<Train, TrainDTO,Long> implements TrainService {

    private final TrainRepository repo;

    private final TrainMapper mapper;

    public TrainServiceImpl(TrainRepository repo,TrainMapper  mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    protected BaseRepository<Train, Long> getRepo() {
        return repo;
    }

    @Override
    protected BaseMapper<Train, TrainDTO> getMapper() {
        return mapper;
    }
}
