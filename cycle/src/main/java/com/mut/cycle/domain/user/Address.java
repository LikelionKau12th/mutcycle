package com.mut.cycle.domain.user;

import jakarta.persistence.*;

@Embeddable
public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;
}