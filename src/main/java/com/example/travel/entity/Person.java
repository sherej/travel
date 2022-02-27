package com.example.travel.entity;

import com.example.travel.common.BaseEntity;
import com.example.travel.common.enums.Gender;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@MappedSuperclass
public class Person extends BaseEntity {

    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Size(max = 10)
    @Column(unique = true,nullable = false)
    private String nationalCode;
    //    @Embedded
//    @Size(max=2)
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date birthDay;
    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private Gender gender;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
