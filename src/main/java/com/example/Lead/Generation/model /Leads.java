package com.example.Lead.Generation.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Leads")
public class Leads {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long leadId;

    private String name;
    private String emailId;
    private String mobileNumber;
    private String city;
    private String area;
    private String pinCode;


    public long getLeadId() {
        return leadId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
}
