package com.talaria.model;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.sql.Timestamp;

/**
 * Created by Davis on 2017-05-22.
 */
@Data
public class ReviewVO { // Table : reviews
    private long author;
    private long orderDetailId;
    private int purchased;
    private String reviewText;
    private int helpfulCount;
    private int overallRate;
    private int surveySize;
    private int surveyWidth;
    private int surveyFit;
    private int surveyQuality;
    private Timestamp createTime;
    private Timestamp updateTime;

}
