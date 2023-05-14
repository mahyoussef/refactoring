package com.mahyoussef.bloaters.largeclass.example1;

public class Address {

    private String country;
    private String city;
    private String street;
    private String apartment;
    private String postalCode;
    private String state;

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", apartment='" + apartment + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
