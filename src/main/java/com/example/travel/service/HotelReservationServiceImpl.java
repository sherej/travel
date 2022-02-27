package com.example.travel.service;

import com.example.travel.common.BaseMapper;
import com.example.travel.common.BaseRepository;
import com.example.travel.common.BaseServiceImpl;
import com.example.travel.dto.HotelReservationDTO;
import com.example.travel.entity.HotelReservation;
import com.example.travel.mapper.HotelReservationMapper;
import com.example.travel.repository.HotelReservationRepository;
import com.example.travel.service.iservice.HotelReservationService;
import org.springframework.stereotype.Service;

@Service
public class HotelReservationServiceImpl extends BaseServiceImpl<HotelReservation, HotelReservationDTO,Long> implements HotelReservationService {

    private final HotelReservationRepository repo;

    private final HotelReservationMapper mapper;

    public HotelReservationServiceImpl(HotelReservationRepository repo,HotelReservationMapper  mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    protected BaseRepository<HotelReservation, Long> getRepo() {
        return repo;
    }

    @Override
    protected BaseMapper<HotelReservation, HotelReservationDTO> getMapper() {
        return mapper;
    }
}
