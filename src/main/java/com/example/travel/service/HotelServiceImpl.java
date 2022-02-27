package com.example.travel.service;

import com.example.travel.common.BaseMapper;
import com.example.travel.common.BaseRepository;
import com.example.travel.common.BaseServiceImpl;
import com.example.travel.dto.HotelDTO;
import com.example.travel.entity.Hotel;
import com.example.travel.mapper.HotelMapper;
import com.example.travel.repository.HotelRepository;
import com.example.travel.service.iservice.HotelService;
import org.springframework.stereotype.Service;

@Service
public class HotelServiceImpl extends BaseServiceImpl<Hotel, HotelDTO,Long> implements HotelService {
    private final HotelRepository repo;

    private final HotelMapper mapper;

    public HotelServiceImpl(HotelRepository repo,HotelMapper  mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    protected BaseRepository<Hotel, Long> getRepo() {
        return repo;
    }

    @Override
    protected BaseMapper<Hotel,HotelDTO > getMapper() {
        return mapper;
    }
}
