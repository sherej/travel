package com.example.travel.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;


@Entity(name="users")
public class User  extends Person{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    @Column(nullable = false)
//    private String firstName;
//    @Column(nullable = false)
//    private String lastName;
//    @Size(max = 10)
//    @Column(unique = true,nullable = false)
//    private String nationalCode;
    //    @Embedded
//    @Temporal(TemporalType.DATE)
//    @Column(nullable = false)
//    private Date birthDay;
    @Email
    @Column(unique = true,nullable = false)
    private String email;

    @Column(unique = true,nullable = false)
    private String phone;

    private String userName;

    @Size(min = 7)
    @Column(nullable = false)
    private String password;

//    private String role;
    private String address;


//    @Enumerated(EnumType.STRING)
//    @Column(length = 10)
//    private Gender gender;

//    public Gender getGender() {
//        return gender;
//    }
//
//    public void setGender(Gender gender) {
//        this.gender = gender;
//    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getNationalCode() {
//        return nationalCode;
//    }
//
//    public void setNationalCode(String nationalCode) {
//        this.nationalCode = nationalCode;
//    }
//
//    public Date getBirthDay() {
//        return birthDay;
//    }
//
//    public void setBirthDay(Date birthDay) {
//        this.birthDay = birthDay;
//    }
}
