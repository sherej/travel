package com.example.travel.service;

import com.example.travel.entity.*;
import com.example.travel.repository.ReservationGuestRepository;
import com.example.travel.repository.ReservationRoomRepository;
import com.example.travel.service.iservice.IService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationRoomService implements IService<ReservationRoom>{
    private ReservationRoomRepository repo;
    @Qualifier("hotelReservationService")
    private IService<HotelReservation> hotelReservationService;
    @Qualifier("roomService")
    private IService<Room> roomService;

    public ReservationRoomService(ReservationRoomRepository repo
            , IService<HotelReservation> hotelReservationService, IService<Room> roomService) {
        this.repo = repo;
        this.hotelReservationService = hotelReservationService;
        this.roomService = roomService;
    }

    @Override
    public ReservationRoom save(Long parentId, ReservationRoom object) {
        return null;
    }

    @Override
    public ReservationRoom save(Long hotelReservationId, Long roomId, ReservationRoom object) {
        HotelReservation hotelReservation=hotelReservationService.findById(hotelReservationId);
        Room room=roomService.findById(roomId);
        object=new ReservationRoom();
        object.setHotelReservation(hotelReservation);
        object.setRoom(room);
        return repo.save(object);
    }

    @Override
    public ReservationRoom save(Long parentOneId, Long parentTwoId, Long parentThreeId, ReservationRoom object) {
        return null;
    }

    @Override
    public ReservationRoom save(ReservationRoom object) {
        return null;
    }

    @Override
    public List<ReservationRoom> findByParentId(Long parentId) {
        return null;
    }

    @Override
    public List<ReservationRoom> findByTwoParentId(Long hotelReservationId, Long roomId) {
        HotelReservation hotelReservation=hotelReservationService.findById(hotelReservationId);
        Room room=roomService.findById(roomId);

        return repo.findAllByHotelReservationAndRoom(hotelReservation,room);
    }

    @Override
    public ReservationRoom findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<ReservationRoom> getAll() {
        return (List<ReservationRoom>) repo.findAll();
    }
}
