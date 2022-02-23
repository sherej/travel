package com.example.travel.service;

import com.example.travel.entity.Hotel;
import com.example.travel.entity.Room;
import com.example.travel.repository.RoomRepository;
import com.example.travel.service.iservice.IService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService implements IService<Room>{

    private RoomRepository repo;
    @Qualifier("hotelService")
    private IService<Hotel> hotelService;

    public RoomService(RoomRepository repo, IService<Hotel> hotelService) {
        this.repo = repo;
        this.hotelService = hotelService;
    }

    @Override
    public Room save(Long parentId, Room object) {
        Hotel hotel=hotelService.findById(parentId);
        object.setHotel(hotel);
        return repo.save(object);
    }

    @Override
    public Room save(Long parentOneId, Long parentTwoId, Room object) {
        return null;
    }

    @Override
    public Room save(Long parentOneId, Long parentTwoId, Long parentThreeId, Room object) {
        return null;
    }

    @Override
    public Room save(Room object) {
        return null;
    }

    @Override
    public List<Room> findByParentId(Long parentId) {
        Hotel hotel=hotelService.findById(parentId);

        return repo.findAllByHotel(hotel);
    }

    @Override
    public List<Room> findByTwoParentId(Long parentOneId, Long parentTwoId) {
        return null;
    }

    @Override
    public Room findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Room> getAll() {
        return (List<Room>) repo.findAll();
    }
}
