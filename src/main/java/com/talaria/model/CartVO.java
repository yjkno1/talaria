package com.talaria.model;

import lombok.Data;

import java.sql.Timestamp;

/**
 * Created by Davis on 2017-05-22.
 *
 */
@Data
public class CartVO { // Table : carts
    private long userId;
    private long productUnitId;
    private int productPrice;
    private int discountPrice;
    private int orderPrice;
    private int deliveryPrice;
    private int paymentPrice;
    private Timestamp createTime;
    private Timestamp updateTime;
}
