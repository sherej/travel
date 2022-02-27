package com.example.travel.entity;

import com.example.travel.common.BaseEntity;
import com.example.travel.common.enums.VehicleType;

import javax.persistence.*;

@Entity(name="terminals")
public class Terminal extends BaseEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private VehicleType type;

    @ManyToOne
    private City city;

    private String address;

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
