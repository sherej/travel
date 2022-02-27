package com.example.travel.service;

import com.example.travel.common.BaseMapper;
import com.example.travel.common.BaseRepository;
import com.example.travel.common.BaseServiceImpl;
import com.example.travel.dto.BusDTO;
import com.example.travel.entity.Bus;
import com.example.travel.mapper.BusMapper;
import com.example.travel.repository.BusRepository;
import com.example.travel.service.iservice.BusService;
import org.springframework.stereotype.Service;

@Service
public class BusServiceImpl extends BaseServiceImpl<Bus, BusDTO,Long> implements BusService {

    private final BusRepository repo;

    private final BusMapper mapper;

    public BusServiceImpl(BusRepository repo,BusMapper  mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    protected BaseRepository<Bus, Long> getRepo() {
        return repo;
    }

    @Override
    protected BaseMapper<Bus,BusDTO > getMapper() {
        return mapper;
    }

}
