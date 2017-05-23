package com.talaria.model;

import lombok.Data;

import java.sql.Timestamp;

/**
 * Created by Davis on 2017-05-22.
 */
@Data
public class ProductVO { // Table : products
    private long productId;
    private long providerId;
    private String productCode;
    private String productName;
    private Timestamp releaseDate;
    private String summary;
    private String placeOrigin;
    private String shipInfo;
    private String description;
    private String precautions;
    private String detailInformation;
    private Timestamp createTime;
    private Timestamp updateTime;
    private int discontinued;
    private String slug;
}
