package com.talaria.model;

import lombok.Data;

/**
 * Created by Davis on 2017-05-22.
 */
@Data
public class ProductUnitVO { // Table : product_units
    private long productUnitId;
    private long productId;
    private long providerId;
    private char skuCode;
    private int price;
    private String providerSkuCode;
    private String lesmoreSkuCode;
    private int supplyUnitPrice;
    private int originalPrice;
    private int lowestPrice;
    private String detailImage1Path;
    private String detailImage2Path;
    private String detailImage3Path;
    private String detailImage4Path;
    private String thumbnail2Path;
    private String thumbnail3Path;
    private String thumbnail4Path;
    private int stockQuantity;
    private int optimumStockQuantity;

}
