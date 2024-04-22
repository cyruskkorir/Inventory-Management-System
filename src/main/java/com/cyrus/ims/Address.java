package com.cyrus.ims;

import lombok.Getter;

public class Address {
    @Getter
    private String street;
    @Getter
    private String town;
    @Getter
    private int postalCode;
    public Address(String street, String town, int postalCode) {
        this.street = street;
        this.town = town;
        this.postalCode = postalCode;
    }
}
