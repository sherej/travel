package com.example.travel.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TourDTO {
    @ApiModelProperty(required = true)
    private CompanyDTO organizer;

    @ApiModelProperty(required = true)
    private CityDTO city;


}
