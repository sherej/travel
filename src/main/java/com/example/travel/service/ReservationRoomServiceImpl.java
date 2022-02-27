package com.example.travel.service;

import com.example.travel.common.BaseMapper;
import com.example.travel.common.BaseRepository;
import com.example.travel.common.BaseServiceImpl;
import com.example.travel.dto.ReservationRoomDTO;
import com.example.travel.entity.*;
import com.example.travel.mapper.ReservationRoomMapper;
import com.example.travel.repository.ReservationRoomRepository;
import com.example.travel.service.iservice.ReservationRoomService;
import org.springframework.stereotype.Service;

@Service
public class ReservationRoomServiceImpl extends BaseServiceImpl<ReservationRoom, ReservationRoomDTO,Long> implements ReservationRoomService {
    private final ReservationRoomRepository repo;

    private final ReservationRoomMapper mapper;

    public ReservationRoomServiceImpl(ReservationRoomRepository repo,ReservationRoomMapper  mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    protected BaseRepository<ReservationRoom, Long> getRepo() {
        return repo;
    }

    @Override
    protected BaseMapper<ReservationRoom, ReservationRoomDTO> getMapper() {
        return mapper;
    }

}
