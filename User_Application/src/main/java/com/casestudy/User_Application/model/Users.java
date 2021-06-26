package com.casestudy.User_Application.model;
import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.*;
import org.springframework.stereotype.*;

import java.util.*;

@Document(value = "userinfo")
public class Users {
    @Id
    private String userId;
    private String userName;
    private String userContact;
    private String userEmail;
    private Address address;
    private String password;
    private Car car;
    public Users(){

    }
    public Users(String userId, String userName, String userContact, String userEmail, Address address, String password,Car car) {
        this.userId = userId;
        this.userName = userName;
        this.userContact = userContact;
        this.userEmail = userEmail;
        this.address = address;
        this.password = password;
        this.car=car;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserContact() {
        return userContact;
    }

    public void setUserContact(String userContact) {
        this.userContact = userContact;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
