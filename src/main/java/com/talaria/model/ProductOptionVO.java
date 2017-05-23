package com.talaria.model;

import lombok.Data;

/**
 * Created by Davis on 2017-05-22.
 */
@Data
public class ProductOptionVO { // Table : product_options
    private long productId;
    private String optionCode;
    private String optionType;
    private String description;
    private String productOrder;

}
