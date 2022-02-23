package com.example.travel.dto;

import com.example.travel.entity.City;
import io.swagger.annotations.ApiModelProperty;


public class HotelDTO extends BaseDTO {
    @ApiModelProperty(required = true)
    private String name;

    @ApiModelProperty(required = true)
    private String stars;
    @ApiModelProperty(required = true)
    private City city;
    @ApiModelProperty(required = true)
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
