package com.example.Lead.Generation.model;

import java.util.ArrayList;

public class Lead {
    private String name;
    private String emailId;
    private String mobileNumber;
    private String city;
    private String area;
    private String pinCode;

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

    public LeadResponse isValidLead() {
        LeadResponse leadResponse = new LeadResponse();
        ArrayList<Error> errors = new ArrayList<>();
        if (getName().isBlank()) {
            errors.add(new Error("Name is blank."));
        }
        if (getEmailId().isBlank()) {
            errors.add(new Error("Email id is blank."));
        }
        if (getMobileNumber().isBlank()) {
            errors.add(new Error("Mobile number is blank."));
        }
        if (getCity().isBlank()) {
            errors.add(new Error("City is blank."));
        }
        if (getArea().isBlank()) {
            errors.add(new Error("Area is blank."));
        }
        if (getPinCode().isBlank()) {
            errors.add(new Error("Pin code is blank."));
        } else if (getPinCode().length() != 6) {
            errors.add(new Error("Incorrect pin code."));
        }

        if (errors.size() == 0) {
            leadResponse.setResponse("success");
        } else {
            leadResponse.setResponse("failure");
            leadResponse.setErrors(errors);
        }
        return leadResponse;
    }

    public Leads toLeads() {
        Leads leads = new Leads();
        leads.setName(getName());
        leads.setEmailId(getEmailId());
        leads.setMobileNumber(getMobileNumber());
        leads.setCity(getCity());
        leads.setArea(getArea());
        leads.setPinCode(getPinCode());
        return leads;
    }
}
