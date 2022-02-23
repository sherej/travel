package com.example.travel.dto;

import io.swagger.annotations.ApiModelProperty;

public class VehicleDTO extends BaseDTO {
    @ApiModelProperty(required = false,hidden = true)
    private String modelName;

    @ApiModelProperty(required = true,hidden = false)
    private int capacity;

    @ApiModelProperty(required = true,hidden = false)
    private CompanyDTO owner;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public CompanyDTO getOwner() {
        return owner;
    }

    public void setOwner(CompanyDTO owner) {
        this.owner = owner;
    }
}
