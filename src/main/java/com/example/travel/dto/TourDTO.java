package com.example.travel.dto;

import io.swagger.annotations.ApiModelProperty;

public class TourDTO extends BaseDTO {
    @ApiModelProperty(required = true)
    private CompanyDTO organizer;

    @ApiModelProperty(required = true)
    private CityDTO city;

    public CompanyDTO getOrganizer() {
        return organizer;
    }

    public void setOrganizer(CompanyDTO organizer) {
        this.organizer = organizer;
    }

    public CityDTO getCity() {
        return city;
    }

    public void setCity(CityDTO city) {
        this.city = city;
    }
}
