package com.talaria.model;

import lombok.Data;

/**
 * Created by Davis on 2017-05-22.
 */
@Data
public class ProductUnitOptionVO { // Table : product_unit_options
    private long productUnitId;
    private String optionCode;
    private String optionType;
}
