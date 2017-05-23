package com.talaria.model;

import lombok.Data;

import java.sql.Timestamp;

/**
 * Created by Davis on 2017-05-22.
 */
@Data
public class FilterVO { // Table : filters
    private long filterId;
    private String filterText;
    private Timestamp createTime;
}
