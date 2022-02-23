package com.example.travel.dto;

import io.swagger.annotations.ApiModelProperty;

public class UserDTO extends PersonDTO{
    @ApiModelProperty(required = true)
    private String email;

    @ApiModelProperty(required = true)
    private String phone;

    @ApiModelProperty(required = true)
    private String userName;

    @ApiModelProperty(required = true)
    private String password;

    @ApiModelProperty(required = true)
    private String address;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
}
