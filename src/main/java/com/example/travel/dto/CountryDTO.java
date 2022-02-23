package com.example.travel.dto;

import io.swagger.annotations.ApiModelProperty;

public class CountryDTO extends BaseDTO {

    @ApiModelProperty(required = true)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
