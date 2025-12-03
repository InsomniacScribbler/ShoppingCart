package com.insomniacScribbler.chauhan_stores.model;

import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.math.BigDecimal;
import java.util.List;

public class Product {
    private Long id;
    private String name;
    private String brand;

    private BigDecimal price;
    private int inventory; // not quantity cuz it will be used later to count the no of orders
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    // FetchType.LAZY LAZY means the category data
    // won't be loaded from the database until you explicitly access it.
    // This improves performance by not loading unnecessary data upfront.
    private Category category;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Image> images;
}
