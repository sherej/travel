package com.example.travel.dto;

import com.example.travel.entity.enums.Gender;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class PersonDTO extends BaseDTO {

    @ApiModelProperty(required = true)
    private String firstName;
    @ApiModelProperty(required = true)
    private String lastName;
    @ApiModelProperty(required = true)
    private String nationalCode;
    @ApiModelProperty(required = true)
    private Date birthDay;
    @ApiModelProperty(required = true)
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
