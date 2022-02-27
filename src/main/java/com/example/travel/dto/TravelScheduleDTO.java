package com.example.travel.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mapstruct.Qualifier;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TravelScheduleDTO  {

    @ApiModelProperty(required = true)
    private VehicleDTO vehicle;

    @ApiModelProperty(required = true)
    private TerminalDTO source;

    @ApiModelProperty(required = true)
    private TerminalDTO destination;

    @ApiModelProperty(required = true)
    private Date departureTime;


}
