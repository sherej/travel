package com.example.travel.dto;

import com.example.travel.entity.enums.CompanyType;
import io.swagger.annotations.ApiModelProperty;

public class CompanyDTO extends BaseDTO {

    @ApiModelProperty(required = true)
    private String name;
    @ApiModelProperty(required = true)
    private CompanyType type;
    @ApiModelProperty(required = true)
    private CityDTO city;
    @ApiModelProperty(required = true)
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CompanyType getType() {
        return type;
    }

    public void setType(CompanyType type) {
        this.type = type;
    }

    public CityDTO getCity() {
        return city;
    }

    public void setCity(CityDTO city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
