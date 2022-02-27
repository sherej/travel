package com.example.travel.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TicketDTO  {
    @ApiModelProperty(required = true)
    private TravelScheduleDTO travelInformation;

    @ApiModelProperty(required = true)
    private String seat;

    @ApiModelProperty(required = true)
    private PaymentDTO payment;

    @ApiModelProperty(required = true)
    private PassengerDTO passenger;


}
