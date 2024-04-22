package com.cyrus.ims;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class Order {
    @Getter @Setter
    private Long id;
    @Getter @Setter
    private Long customerId;
    @Getter @Setter
    private Long productId;
    @Getter @Setter
    private Date date;
}
