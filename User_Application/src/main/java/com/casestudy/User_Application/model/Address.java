package com.casestudy.User_Application.model;

public class Address {
    private String flatNo;
    private String streetName;
    private String city;
    private String state;
    private int pinCode;
    private String country;
    public Address(){

    }
    public Address(String flatNo, String streetName, String city, String state,int pinCode, String country) {
        this.flatNo = flatNo;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.pinCode=pinCode;
        this.country = country;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
