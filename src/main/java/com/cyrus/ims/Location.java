package com.cyrus.ims;

import lombok.Getter;
import lombok.Setter;

public class Location {
    @Getter @Setter
    private float longitude;
    @Getter @Setter
    private float latitude;
    @Getter @Setter
    private Address address;

}
