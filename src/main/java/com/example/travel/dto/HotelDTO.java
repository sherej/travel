package com.example.travel.dto;

import com.example.travel.entity.City;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HotelDTO  {
    @ApiModelProperty(required = true)
    private String name;

    @ApiModelProperty(required = true)
    private String stars;
    @ApiModelProperty(required = true)
    private City city;
    @ApiModelProperty(required = true)
    private String address;


}
