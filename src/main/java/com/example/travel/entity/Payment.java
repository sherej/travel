package com.example.travel.entity;

import com.example.travel.entity.enums.PaymentStatus;

import javax.persistence.*;
import java.util.Date;


@Entity(name="payments")
public class Payment extends BaseEntity{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    @Enumerated
    private PaymentStatus status;

    @Temporal(TemporalType.TIMESTAMP)
    private Date time;

    @ManyToOne
    private User payedUser;

    private Long amount;

//    @ManyToOne
//    private User payedUser;

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

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


    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public User getPayedUser() {
        return payedUser;
    }

    public void setPayedUser(User payedUser) {
        this.payedUser = payedUser;
    }
}
