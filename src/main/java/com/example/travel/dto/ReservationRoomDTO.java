package com.example.travel.dto;

import io.swagger.annotations.ApiModelProperty;

public class ReservationRoomDTO extends BaseDTO {
    @ApiModelProperty(required = true)
    private HotelReservationDTO hotelReservation;
    @ApiModelProperty(required = true)
    private RoomDTO room;

    public HotelReservationDTO getHotelReservation() {
        return hotelReservation;
    }

    public void setHotelReservation(HotelReservationDTO hotelReservation) {
        this.hotelReservation = hotelReservation;
    }

    public RoomDTO getRoom() {
        return room;
    }

    public void setRoom(RoomDTO room) {
        this.room = room;
    }
}
