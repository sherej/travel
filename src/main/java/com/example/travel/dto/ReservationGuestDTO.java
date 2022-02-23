package com.example.travel.dto;

import io.swagger.annotations.ApiModelProperty;


public class ReservationGuestDTO extends BaseDTO {

    @ApiModelProperty(required = true)
    private HotelReservationDTO hotelReservation;

    @ApiModelProperty(required = true)
    private PassengerDTO guest;

    public HotelReservationDTO getHotelReservation() {
        return hotelReservation;
    }

    public void setHotelReservation(HotelReservationDTO hotelReservation) {
        this.hotelReservation = hotelReservation;
    }

    public PassengerDTO getGuest() {
        return guest;
    }

    public void setGuest(PassengerDTO guest) {
        this.guest = guest;
    }
}
