package com.example.travel.service;

import com.example.travel.common.BaseMapper;
import com.example.travel.common.BaseRepository;
import com.example.travel.common.BaseServiceImpl;
import com.example.travel.dto.TravelScheduleDTO;
import com.example.travel.entity.TravelSchedule;
import com.example.travel.mapper.TravelScheduleMapper;
import com.example.travel.repository.TravelScheduleRepository;
import com.example.travel.service.iservice.TravelScheduleService;
import org.springframework.stereotype.Service;

@Service
public class TravelScheduleServiceImpl extends BaseServiceImpl<TravelSchedule, TravelScheduleDTO,Long> implements TravelScheduleService {

    private final TravelScheduleRepository repo;

    private final TravelScheduleMapper mapper;

    public TravelScheduleServiceImpl(TravelScheduleRepository repo,TravelScheduleMapper  mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    protected BaseRepository<TravelSchedule, Long> getRepo() {
        return repo;
    }

    @Override
    protected BaseMapper<TravelSchedule, TravelScheduleDTO> getMapper() {
        return mapper;
    }
}
