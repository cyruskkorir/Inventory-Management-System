package com.cyrus.ims;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Delivery {
    private Long id;
    private Date delieveryDate;
    private String carrier;
    private ShippingStatus ShippingStatus;
    
}
