package com.mahyoussef.bloaters.largeclass.example1;

import java.time.LocalDateTime;

public class Employee {

    private String firstName;
    private String lastName;
    private String employeeId;
    private String department;
    private String email;
    private LocalDateTime dateOfBirth;
    private LocalDateTime hiringDate;
    private String country;
    private String city;
    private String street;
    private String postalCode;
    private String apartment;
    private String state;

    public String getFullAddress() {
        return "City: %s, State: %s, Country: %s, Street: %s, ApartmentNo: %s, PostalCode: %s"
                .formatted(city, state, country, street, apartment, postalCode);
    }
}
