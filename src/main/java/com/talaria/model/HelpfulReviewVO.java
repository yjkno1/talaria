package com.talaria.model;

import lombok.Data;

import java.sql.Timestamp;

/**
 * Created by Davis on 2017-05-22.
 */
@Data
public class HelpfulReviewVO { // Table : helpful_reviews
    private long userId;
    private long author;
    private String productCode;
    private long reviewId;
    private Timestamp createTime;
    private Timestamp updateTime;
}
