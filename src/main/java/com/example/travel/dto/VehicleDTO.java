package com.example.travel.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VehicleDTO  {
    @ApiModelProperty(required = false,hidden = true)
    private String modelName;

    @ApiModelProperty(required = true,hidden = false)
    private int capacity;

    @ApiModelProperty(required = true,hidden = false)
    private CompanyDTO owner;


}
