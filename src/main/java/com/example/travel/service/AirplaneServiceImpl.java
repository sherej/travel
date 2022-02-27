package com.example.travel.service;

import com.example.travel.common.BaseMapper;
import com.example.travel.common.BaseRepository;
import com.example.travel.common.BaseServiceImpl;
import com.example.travel.dto.AirplaneDTO;
import com.example.travel.entity.Airplane;
import com.example.travel.mapper.AirplaneMapper;
import com.example.travel.repository.AirplaneRepository;
import com.example.travel.service.iservice.AirplaneService;
import org.springframework.stereotype.Service;

@Service
public class AirplaneServiceImpl extends BaseServiceImpl<Airplane, AirplaneDTO,Long> implements AirplaneService {
    private final AirplaneRepository repo;

    private final AirplaneMapper mapper;

    public AirplaneServiceImpl(AirplaneRepository repo,AirplaneMapper  mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    protected BaseRepository<Airplane, Long> getRepo() {
        return repo;
    }

    @Override
    protected BaseMapper<Airplane, AirplaneDTO> getMapper() {
        return mapper;
    }
}
