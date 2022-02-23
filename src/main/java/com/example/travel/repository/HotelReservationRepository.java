package com.example.travel.repository;

import com.example.travel.entity.HotelReservation;
import com.example.travel.entity.Payment;
import com.example.travel.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelReservationRepository extends PagingAndSortingRepository<HotelReservation,Long>{
    List<HotelReservation> findAllByOrderingUser(User user);
    List<HotelReservation> findAllByOrderingUserAndPayment(User user, Payment payment);
}
