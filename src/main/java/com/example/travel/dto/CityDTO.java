package com.example.travel.dto;

import com.example.travel.entity.Country;
import io.swagger.annotations.ApiModelProperty;

public class CityDTO extends BaseDTO {
    @ApiModelProperty(required = true)
    private String name;

    @ApiModelProperty(required = true)
    private Country country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
