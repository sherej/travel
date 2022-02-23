package com.example.travel.dto;

import com.example.travel.entity.enums.VehicleType;
import io.swagger.annotations.ApiModelProperty;


public class TerminalDTO extends BaseDTO {

    @ApiModelProperty(required = true)
    private String name;
    @ApiModelProperty(required = true)
    private VehicleType type;

    @ApiModelProperty(required = true)
    private CityDTO city;
    @ApiModelProperty(required = true)
    private String address;
}
