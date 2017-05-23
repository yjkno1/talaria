package com.talaria.model;

import lombok.Data;

/**
 * Created by Davis on 2017-05-22.
 */
@Data
public class CategoryVO { // Table : categories
    private long categoryId;
    private String name;
    private String thumbnailPath;
}
