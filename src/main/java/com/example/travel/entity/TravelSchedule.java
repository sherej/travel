package com.example.travel.entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "travel_schedules")
public class TravelSchedule extends BaseEntity{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    @ManyToOne
    private Vehicle vehicle;

    @ManyToOne
    private Terminal source;

    @ManyToOne
    private Terminal destination;

    @Temporal(TemporalType.DATE)
    private Date  departureTime;

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Terminal getSource() {
        return source;
    }

    public void setSource(Terminal source) {
        this.source = source;
    }

    public Terminal getDestination() {
        return destination;
    }

    public void setDestination(Terminal destination) {
        this.destination = destination;
    }
}
