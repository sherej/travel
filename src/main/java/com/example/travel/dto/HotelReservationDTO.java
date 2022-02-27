package com.example.travel.dto;

import com.example.travel.entity.Payment;
import com.example.travel.entity.User;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class HotelReservationDTO  {

    @ApiModelProperty(required = true)
    private User orderingUser;

    @ApiModelProperty(required = true)
    private Payment payment;

    @ApiModelProperty(required = true)
    private Date fromDate;

    @ApiModelProperty(required = true)
    private Date toDate;

}
