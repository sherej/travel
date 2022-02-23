package com.example.travel.dto;

import com.example.travel.entity.enums.BedCount;
import io.swagger.annotations.ApiModelProperty;


public class RoomDTO extends BaseDTO {

    @ApiModelProperty(required = true)
    private int grade;
    @ApiModelProperty(required = true)
    private String floor;
    @ApiModelProperty(required = true)
    private String floor_count;

    @ApiModelProperty(required = true)
    private BedCount bedCount;
    @ApiModelProperty(required = true)
    private HotelDTO hotel;


    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getFloor_count() {
        return floor_count;
    }

    public void setFloor_count(String floor_count) {
        this.floor_count = floor_count;
    }

    public BedCount getBedCount() {
        return bedCount;
    }

    public void setBedCount(BedCount bedCount) {
        this.bedCount = bedCount;
    }

    public HotelDTO getHotel() {
        return hotel;
    }

    public void setHotel(HotelDTO hotel) {
        this.hotel = hotel;
    }
}
