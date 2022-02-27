package com.example.travel.dto;

import com.example.travel.common.enums.VehicleType;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TerminalDTO  {

    @ApiModelProperty(required = true)
    private String name;
    @ApiModelProperty(required = true)
    private VehicleType type;

    @ApiModelProperty(required = true)
    private CityDTO city;
    @ApiModelProperty(required = true)
    private String address;
}
