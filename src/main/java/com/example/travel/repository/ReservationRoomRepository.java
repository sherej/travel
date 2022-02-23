package com.example.travel.repository;

import com.example.travel.entity.HotelReservation;
import com.example.travel.entity.Passenger;
import com.example.travel.entity.ReservationRoom;
import com.example.travel.entity.Room;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRoomRepository extends PagingAndSortingRepository<ReservationRoom,Long>{
    List<ReservationRoom> findAllByHotelReservationAndRoom(HotelReservation hotelReservation, Room room);
}
