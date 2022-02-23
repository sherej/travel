package com.example.travel.dto;

import com.example.travel.entity.Payment;
import com.example.travel.entity.User;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class HotelReservationDTO extends BaseDTO {

    @ApiModelProperty(required = true)
    private User orderingUser;

    @ApiModelProperty(required = true)
    private Payment payment;

    @ApiModelProperty(required = true)
    private Date fromDate;

    @ApiModelProperty(required = true)
    private Date toDate;

    public User getOrderingUser() {
        return orderingUser;
    }

    public void setOrderingUser(User orderingUser) {
        this.orderingUser = orderingUser;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}
