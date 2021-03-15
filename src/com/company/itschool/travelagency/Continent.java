package com.company.itschool.travelagency;

import java.util.ArrayList;

public class Continent {

    private String name;

    private ArrayList<Country> countries = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Country> getCountries() {
        return countries;
    }

    public void setCountries(ArrayList<Country> countries) {
        this.countries = countries;
    }

    public void display() {
        System.out.println(name);
        for (int i = 0; i < countries.size(); i++) {
            Country country = countries.get(i);
            country.display();
        }
    }
}
