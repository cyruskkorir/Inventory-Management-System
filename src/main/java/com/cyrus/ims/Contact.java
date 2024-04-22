package com.cyrus.ims;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Contact {
    private String email;
    private int phone;
    private Address address;
}
