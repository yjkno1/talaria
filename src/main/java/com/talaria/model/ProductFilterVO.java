package com.talaria.model;

import lombok.Data;

import java.sql.Timestamp;

/**
 * Created by Davis on 2017-05-22.
 */
@Data
public class ProductFilterVO { // Table : products_filters
    private long productId;
    private long filterId;
    private Timestamp createTime;
}
