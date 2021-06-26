package com.casestudy.User_Application.model;

import org.springframework.data.annotation.*;

public class Car {
    @Id
    private String carId;
    private String carNumber;
    private String carModel;
    private String carColour;
    public Car(){

    }
    public Car(String carId, String carNumber, String carModel, String carColour) {
        this.carId = carId;
        this.carNumber = carNumber;
        this.carModel = carModel;
        this.carColour = carColour;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarColour() {
        return carColour;
    }

    public void setCarColour(String carColour) {
        this.carColour = carColour;
    }
}
