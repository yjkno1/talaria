package com.talaria.model;

import lombok.Data;

import java.sql.Timestamp;

/**
 * Created by Davis on 2017-05-22.
 */
@Data
public class TsviewimageVO { // Table : tsviewimages
    private long imageId;
    private String productCode;
    private String optionCode;
    private String imagePath;
    private String thumbnailPath;
    private int sourceType;
    private String sourceUrl;
    private long userId;
    private int screened;
    private int rejected;
    private Timestamp createTime;
    private Timestamp updateTime;

}
