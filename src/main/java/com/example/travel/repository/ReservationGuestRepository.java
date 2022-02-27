package com.example.travel.repository;

import com.example.travel.common.BaseRepository;
import com.example.travel.entity.HotelReservation;
import com.example.travel.entity.Passenger;
import com.example.travel.entity.ReservationGuest;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationGuestRepository extends BaseRepository<ReservationGuest,Long> {
//    List<ReservationGuest> findAllByHotelReservationAndGuest(HotelReservation hotelReservation, Passenger guest);
}
