package com.example.travel.entity;

import com.example.travel.common.BaseEntity;

import javax.persistence.*;

@Entity(name="tours")
public class Tour extends BaseEntity {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    @ManyToOne
    private Company organizer;

//    @ManyToOne
//    private Hotel hotel;

//    @ManyToOne
//    private TravelSchedule travelSchedule;

    @ManyToOne
    private City city;



//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public Company getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Company organizer) {
        this.organizer = organizer;
    }

//    public Hotel getHotel() {
//        return hotel;
//    }
//
//    public void setHotel(Hotel hotel) {
//        this.hotel = hotel;
//    }
//
//    public TravelSchedule getTravelSchedule() {
//        return travelSchedule;
//    }
//
//    public void setTravelSchedule(TravelSchedule travelSchedule) {
//        this.travelSchedule = travelSchedule;
//    }


    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
