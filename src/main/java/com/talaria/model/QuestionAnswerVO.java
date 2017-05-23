package com.talaria.model;

import lombok.Data;

import java.sql.Timestamp;

/**
 * Created by Davis on 2017-05-22.
 */
@Data
public class QuestionAnswerVO { // Table : question_answers
    private long questionAnswerId;
    private long userId;
    private String productCode;
    private String content;
    private Timestamp updateTime;
    private Timestamp createTime;
}
