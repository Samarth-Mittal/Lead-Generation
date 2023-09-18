package com.example.Lead.Generation.model;

import java.util.ArrayList;

public class LeadResponse {
    private String response;
    private ArrayList<Error> errors;
    private Leads data;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public ArrayList<Error> getErrors() {
        return errors;
    }

    public void setErrors(ArrayList<Error> errors) {
        this.errors = errors;
    }

    public Leads getData() {
        return data;
    }

    public void setData(Leads data) {
        this.data = data;
    }
}
