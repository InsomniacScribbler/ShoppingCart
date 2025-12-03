package com.insomniacScribbler.chauhan_stores.model;

import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;

import java.sql.Blob;

public class Image {
    private Long id;
    private String fileName;
    private String fileType;
    private Blob image;
    private String downloadUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;
}
