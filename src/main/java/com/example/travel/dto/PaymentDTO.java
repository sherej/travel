package com.example.travel.dto;

import com.example.travel.entity.User;
import com.example.travel.common.enums.PaymentStatus;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentDTO  {

    @ApiModelProperty(required = true)
    private PaymentStatus status;
    @ApiModelProperty(required = true)
    private Date time;
    @ApiModelProperty(required = true)
    private User payedUser;
    @ApiModelProperty(required = true)
    private Long amount;

}
