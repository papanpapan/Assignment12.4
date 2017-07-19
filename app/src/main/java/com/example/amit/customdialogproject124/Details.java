package com.example.amit.customdialogproject124;

/**
 * Created by Amit on 6/21/2017.
 */

public class Details {
    private String name;
    private String phone_number;
    private String DOB;

    public Details(String phone_number, String DOB, String name) {
        this.name = name;
        this.phone_number = phone_number;
        this.DOB = DOB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
}