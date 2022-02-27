package com.example.travel.service;

import com.example.travel.common.BaseMapper;
import com.example.travel.common.BaseRepository;
import com.example.travel.common.BaseServiceImpl;
import com.example.travel.dto.ReservationGuestDTO;
import com.example.travel.entity.ReservationGuest;
import com.example.travel.mapper.ReservationGuestMapper;
import com.example.travel.repository.ReservationGuestRepository;
import com.example.travel.service.iservice.ReservationGuestService;
import org.springframework.stereotype.Service;

@Service
public class ReservationGuestServiceImpl extends BaseServiceImpl<ReservationGuest, ReservationGuestDTO,Long> implements ReservationGuestService {

    private final ReservationGuestRepository repo;

    private final ReservationGuestMapper mapper;

    public ReservationGuestServiceImpl(ReservationGuestRepository repo, ReservationGuestMapper  mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    protected BaseRepository<ReservationGuest, Long> getRepo() {
        return repo;
    }

    @Override
    protected BaseMapper<ReservationGuest,ReservationGuestDTO > getMapper() {
        return mapper;
    }
}
