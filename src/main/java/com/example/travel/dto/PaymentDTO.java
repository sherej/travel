package com.example.travel.dto;

import com.example.travel.entity.User;
import com.example.travel.entity.enums.PaymentStatus;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class PaymentDTO extends BaseDTO {

    @ApiModelProperty(required = true)
    private PaymentStatus status;
    @ApiModelProperty(required = true)
    private Date time;
    @ApiModelProperty(required = true)
    private User payedUser;
    @ApiModelProperty(required = true)
    private Long amount;

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public User getPayedUser() {
        return payedUser;
    }

    public void setPayedUser(User payedUser) {
        this.payedUser = payedUser;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
