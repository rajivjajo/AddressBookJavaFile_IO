package com.bridgelabz;

public class Contact {
    private String name;
    private String email;
    private String phoneNumber;
    private String city;
    private String state;

    public Contact(String name, String email, String phoneNumber, String city, String state) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Email: " + email + ", Phone Number: " + phoneNumber + ", City: " + city + ", State: " + state;
    }
}

