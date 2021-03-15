package com.company.itschool.travelagency;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //
        Continent europa =  new Continent();
        europa.setName("Europa");
        ArrayList<Country> countries = new ArrayList<>();
        Country romania =  new Country();
        romania.setName("Romania");
        City bucuresti =  new City();
        bucuresti.setName("Bucuresti");
        Airport airportOtp =  new Airport();
        airportOtp.setName("OTP");
        ArrayList<Airport> airportsBucuresti =  new ArrayList<>();
        airportsBucuresti.add(airportOtp);

        Hotel ramada = new Hotel();
        ramada.setNume("Ramada");
        Hotel hilton =  new Hotel();
        hilton.setNume("Hilton");

        ArrayList<Hotel> hoteleBucresti = new ArrayList<>();
        hoteleBucresti.add(ramada);
        hoteleBucresti.add(hilton);
        bucuresti.setHotels(hoteleBucresti);
        bucuresti.setAirports(airportsBucuresti);

        Airport airportCraiova = new Airport();
        airportCraiova.setName("CRA");
        ArrayList<Airport> airportsCraiova = new ArrayList<>();
        airportsCraiova.add(airportCraiova);

        City craiova = new City();
        craiova.setName("Craiova");
        craiova.setAirports(airportsCraiova);

        ArrayList<City> citiesRomania = new ArrayList<>();

        citiesRomania.add(bucuresti);
        citiesRomania.add(craiova);

        romania.setCities(citiesRomania);
        countries.add(romania);
        europa.setCountries(countries);

        europa.display();
    }
}
