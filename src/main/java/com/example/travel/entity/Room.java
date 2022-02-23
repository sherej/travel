package com.example.travel.entity;

import com.example.travel.entity.enums.BedCount;
import com.example.travel.entity.enums.CompanyType;

import javax.persistence.*;

@Entity(name="rooms")
public class Room extends BaseEntity{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    private int grade;

    private String floor;

    private String floor_count;

    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private BedCount bedCount;

    @ManyToOne
    private Hotel hotel;

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getFloor_count() {
        return floor_count;
    }

    public void setFloor_count(String floor_count) {
        this.floor_count = floor_count;
    }

    public BedCount getBedCount() {
        return bedCount;
    }

    public void setBedCount(BedCount bedCount) {
        this.bedCount = bedCount;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
