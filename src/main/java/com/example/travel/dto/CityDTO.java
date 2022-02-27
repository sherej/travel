package com.example.travel.dto;

import com.example.travel.entity.Country;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CityDTO  {//extends BaseDTO
    @ApiModelProperty(required = true)
    private String name;

    @ApiModelProperty(required = true)
    private Country country;


}
