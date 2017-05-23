package com.talaria.model;

import lombok.Data;

import java.sql.Timestamp;

/**
 * Created by Davis on 2017-05-22.
 */
@Data
public class ProviderVO { // Table : providers
    private long providerId;
    private String providerName;
    private String bizRegistrationNum; // char
    private String address;
    private String phone;
    private String postCode; // char
    private String bankAccount;
    private long userId;
    private long productUnitId;
    private Timestamp createTime;

}
