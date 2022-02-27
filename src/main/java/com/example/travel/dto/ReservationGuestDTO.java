package com.example.travel.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReservationGuestDTO  {

    @ApiModelProperty(required = true)
    private HotelReservationDTO hotelReservation;

    @ApiModelProperty(required = true)
    private PassengerDTO guest;


}
