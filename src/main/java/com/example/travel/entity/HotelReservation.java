package com.example.travel.entity;

import com.example.travel.common.BaseEntity;

import javax.persistence.*;
import java.util.Date;

@Entity(name="reservations")
public class HotelReservation extends BaseEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    @ManyToOne
    private User orderingUser;

    @OneToOne
    private Payment payment;

//    @OneToMany
//    private List<Room> rooms;
//
//    @OneToMany
//    private List<Passenger> guests;

    @Temporal(TemporalType.DATE)
    private Date fromDate;

    @Temporal(TemporalType.DATE)
    private Date toDate;

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public User getOrderingUser() {
        return orderingUser;
    }

    public void setOrderingUser(User orderingUser) {
        this.orderingUser = orderingUser;
    }

//    public List<Passenger> getGuests() {
//        return guests;
//    }
//
//    public void setGuests(List<Passenger> guests) {
//        this.guests = guests;
//    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

//    public List<Room> getRooms() {
//        return rooms;
//    }
//
//    public void setRooms(List<Room> rooms) {
//        this.rooms = rooms;
//    }

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
