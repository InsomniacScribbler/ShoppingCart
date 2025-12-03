package com.insomniacScribbler.chauhan_stores.model;

import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.sql.Blob;

public class Image {
    private Long id;
    private String fileName;
    private String fileType;
    private Blob image;
    private String downloadUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    /*
    * The @JoinColumn annotation specifies the foreign key column name in the database.
    * In this case, it creates a column called product_id in the current table that references the Product table's primary key.
    * */
    private Product product;
}
