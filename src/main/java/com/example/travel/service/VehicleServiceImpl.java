package com.example.travel.service;

import com.example.travel.common.BaseMapper;
import com.example.travel.common.BaseRepository;
import com.example.travel.common.BaseServiceImpl;
import com.example.travel.dto.VehicleDTO;
import com.example.travel.entity.Vehicle;
import com.example.travel.mapper.VehicleMapper;
import com.example.travel.repository.VehicleRepository;
import com.example.travel.service.iservice.VehicleService;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl extends BaseServiceImpl<Vehicle, VehicleDTO,Long> implements VehicleService {
    private final VehicleRepository repo;

    private final VehicleMapper mapper;

    public VehicleServiceImpl(VehicleRepository repo,VehicleMapper  mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    protected BaseRepository<Vehicle, Long> getRepo() {
        return repo;
    }

    @Override
    protected BaseMapper<Vehicle, VehicleDTO> getMapper() {
        return mapper;
    }
}
