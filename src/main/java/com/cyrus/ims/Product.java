package com.cyrus.ims;

import lombok.Getter;
import lombok.Setter;

public class Product {
    @Getter @Setter
    private Long id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private int price;
    @Getter @Setter
    private int quantity;
    @Getter @Setter
    private String category;

    
}
