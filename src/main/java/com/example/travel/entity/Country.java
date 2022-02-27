package com.example.travel.entity;

import com.example.travel.common.BaseEntity;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;

@Entity(name="countries")
@Audited
public class Country extends BaseEntity {


//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    private String name;

//    private Long population;

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

//    public Long getPopulation() {
//        return population;
//    }
//
//    public void setPopulation(Long population) {
//        this.population = population;
//    }
}
