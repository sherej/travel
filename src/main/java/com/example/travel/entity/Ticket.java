package com.example.travel.entity;

import com.example.travel.common.BaseEntity;

import javax.persistence.*;

@Entity(name = "tickets")
public class Ticket extends BaseEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    @ManyToOne
    private TravelSchedule travelSchedule;

    private String seat;

    @ManyToOne
    private Payment payment;

    @ManyToOne
    private Passenger passenger;

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public TravelSchedule getTravelSchedule() {
        return travelSchedule;
    }

    public void setTravelSchedule(TravelSchedule travelSchedule) {
        this.travelSchedule = travelSchedule;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}
