package com.cyrus.ims;

import lombok.Getter;
import lombok.Setter;

public class Customer {
    @Getter @Setter
    private Long id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private Address address;
}
