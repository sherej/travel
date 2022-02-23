package com.example.travel.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity(name="reservations_guests")
public class ReservationGuest extends BaseEntity{
    @ManyToOne
    private HotelReservation hotelReservation;

    @ManyToOne
    private Passenger guest;

    public HotelReservation getHotelReservation() {
        return hotelReservation;
    }

    public void setHotelReservation(HotelReservation hotelReservation) {
        this.hotelReservation = hotelReservation;
    }

    public Passenger getGuest() {
        return guest;
    }

    public void setGuest(Passenger guest) {
        this.guest = guest;
    }
}
