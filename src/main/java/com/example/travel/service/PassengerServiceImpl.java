package com.example.travel.service;

import com.example.travel.common.BaseMapper;
import com.example.travel.common.BaseRepository;
import com.example.travel.common.BaseServiceImpl;
import com.example.travel.dto.PassengerDTO;
import com.example.travel.entity.Passenger;
import com.example.travel.mapper.PassengerMapper;
import com.example.travel.repository.PassengerRepository;
import com.example.travel.service.iservice.PassengerService;
import org.springframework.stereotype.Service;

@Service
public class PassengerServiceImpl extends BaseServiceImpl<Passenger, PassengerDTO,Long> implements PassengerService {

    private final PassengerRepository repo;

    private final PassengerMapper mapper;

    public PassengerServiceImpl(PassengerRepository repo, PassengerMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    protected BaseRepository<Passenger, Long> getRepo() {
        return repo;
    }

    @Override
    protected BaseMapper<Passenger, PassengerDTO> getMapper() {
        return mapper;
    }
}
