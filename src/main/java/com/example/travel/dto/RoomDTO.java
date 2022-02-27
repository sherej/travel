package com.example.travel.dto;

import com.example.travel.common.enums.BedCount;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RoomDTO {

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



}
