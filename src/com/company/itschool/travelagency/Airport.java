package com.company.itschool.travelagency;

public class Airport {
    private String name;
    private String isoCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public void display() {
        System.out.println("->" + name);
    }
}
