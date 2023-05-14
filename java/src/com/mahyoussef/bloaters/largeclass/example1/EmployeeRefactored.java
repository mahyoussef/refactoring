package com.mahyoussef.bloaters.largeclass.example1;

import java.time.LocalDateTime;

public class EmployeeRefactored {

    private String firstName;
    private String lastName;
    private String employeeId;
    private String department;
    private String email;
    private LocalDateTime dateOfBirth;
    private LocalDateTime hiringDate;
    private Address address;

    public Address getAddress() {
        return this.address;
    }

    public String getFullAddress() {
        return this.address.toString();
    }

}
