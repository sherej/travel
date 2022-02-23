package com.example.travel.entity;

import javax.persistence.*;

@Entity(name = "tickets")
public class Ticket extends BaseEntity{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    @ManyToOne
    private TravelSchedule travelInformation;

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

    public TravelSchedule getTravelInformation() {
        return travelInformation;
    }

    public void setTravelInformation(TravelSchedule travelInformation) {
        this.travelInformation = travelInformation;
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
