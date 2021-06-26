package io.adminapplication.Admin_Application.model;

import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.*;

@Document(value = "admin")
public class AdminInfo {
    @Id
    private String adminId;
    private String adminName;
    private String adminContact;
    private String adminEmail;
    private String adminPassword;
    public AdminInfo(){

    }
    public AdminInfo(String adminId, String adminName, String adminContact, String adminEmail, String adminPassword) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminContact = adminContact;
        this.adminEmail = adminEmail;
        this.adminPassword = adminPassword;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminContact() {
        return adminContact;
    }

    public void setAdminContact(String adminContact) {
        this.adminContact = adminContact;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
}
