package io.washerapplication.Washer_Application.model;

import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.*;

@Document(value = "washer")
public class Washer {
    @Id
    private String washerId;
    private String washerName;
    private Long washerContactNo;
    private String washerEmail;
    private String password;
    public Washer(){

    }
    public Washer(String washerId, String washerName, Long washerContactNo, String washerEmail, String password) {
        this.washerId = washerId;
        this.washerName = washerName;
        this.washerContactNo = washerContactNo;
        this.washerEmail = washerEmail;
        this.password = password;
    }

    public String getWasherId() {
        return washerId;
    }

    public void setWasherId(String washerId) {
        this.washerId = washerId;
    }

    public String getWasherName() {
        return washerName;
    }

    public void setWasherName(String washerName) {
        this.washerName = washerName;
    }

    public Long getWasherContactNo() {
        return washerContactNo;
    }

    public void setWasherContactNo(Long washerContactNo) {
        this.washerContactNo = washerContactNo;
    }

    public String getWasherEmail() {
        return washerEmail;
    }

    public void setWasherEmail(String washerEmail) {
        this.washerEmail = washerEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
