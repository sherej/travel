package com.example.travel.dto;

import io.swagger.annotations.ApiModelProperty;


public class TicketDTO extends BaseDTO {
    @ApiModelProperty(required = true)
    private TravelScheduleDTO travelInformation;

    @ApiModelProperty(required = true)
    private String seat;

    @ApiModelProperty(required = true)
    private PaymentDTO payment;

    @ApiModelProperty(required = true)
    private PassengerDTO passenger;

    public TravelScheduleDTO getTravelInformation() {
        return travelInformation;
    }

    public void setTravelInformation(TravelScheduleDTO travelInformation) {
        this.travelInformation = travelInformation;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public PaymentDTO getPayment() {
        return payment;
    }

    public void setPayment(PaymentDTO payment) {
        this.payment = payment;
    }

    public PassengerDTO getPassenger() {
        return passenger;
    }

    public void setPassenger(PassengerDTO passenger) {
        this.passenger = passenger;
    }
}
