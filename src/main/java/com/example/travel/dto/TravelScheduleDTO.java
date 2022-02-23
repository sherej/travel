package com.example.travel.dto;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

public class TravelScheduleDTO extends BaseDTO {

    @ApiModelProperty(required = true)
    private VehicleDTO vehicle;

    @ApiModelProperty(required = true)
    private TerminalDTO source;

    @ApiModelProperty(required = true)
    private TerminalDTO destination;

    @ApiModelProperty(required = true)
    private Date departureTime;

    public VehicleDTO getVehicle() {
        return vehicle;
    }

    public void setVehicle(VehicleDTO vehicle) {
        this.vehicle = vehicle;
    }

    public TerminalDTO getSource() {
        return source;
    }

    public void setSource(TerminalDTO source) {
        this.source = source;
    }

    public TerminalDTO getDestination() {
        return destination;
    }

    public void setDestination(TerminalDTO destination) {
        this.destination = destination;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }
}
