package com.talaria.model;

import lombok.Data;

/**
 * Created by Davis on 2017-05-22.
 */
@Data
public class InfographicVO { // Table : infographics
    private long infographicId;
    private String imagePath;
    private String title;
    private String description;
}
