package com.talaria.model;

import lombok.Data;

import java.sql.Timestamp;

/**
 * Created by Davis on 2017-05-22.
 */
@Data
public class TsviewTagVO { // Table : tsview_tags
    private long tsviewTagId;
    private String name;
    private Timestamp createDate;
}
