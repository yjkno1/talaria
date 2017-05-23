package com.talaria.model;

import lombok.Data;

import java.sql.Timestamp;

/**
 * Created by Davis on 2017-05-22.
 */
@Data
public class ReviewReportVO { // Table : review_reports
    private long reportId;
    private long author;
    private String productcode;
    private long userId;
    private long questionAnswerId;
    private Timestamp createTime;
    private Timestamp updateTime;
}
