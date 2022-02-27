package com.example.travel.entity;

import com.example.travel.common.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity(name="reservations_rooms")
public class ReservationRoom extends BaseEntity {

    @ManyToOne
    private HotelReservation hotelReservation;

    @ManyToOne
    private Room room;


    public HotelReservation getHotelReservation() {
        return hotelReservation;
    }

    public void setHotelReservation(HotelReservation hotelReservation) {
        this.hotelReservation = hotelReservation;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
