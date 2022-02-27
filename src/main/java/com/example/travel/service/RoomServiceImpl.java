package com.example.travel.service;

import com.example.travel.common.BaseMapper;
import com.example.travel.common.BaseRepository;
import com.example.travel.common.BaseServiceImpl;
import com.example.travel.dto.RoomDTO;
import com.example.travel.entity.Room;
import com.example.travel.mapper.RoomMapper;
import com.example.travel.repository.RoomRepository;
import com.example.travel.service.iservice.RoomService;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl extends BaseServiceImpl<Room, RoomDTO,Long> implements RoomService {

    private final RoomRepository repo;

    private final RoomMapper mapper;

    public RoomServiceImpl(RoomRepository repo, RoomMapper  mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    protected BaseRepository<Room, Long> getRepo() {
        return repo;
    }

    @Override
    protected BaseMapper<Room, RoomDTO> getMapper() {
        return mapper;
    }
}
