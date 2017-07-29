package com.demchenko.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

// TODO: 29.07.17 Analyze data types and migrate to another database
@Data
public class CarBean {
    private String userId;
    private String chipsCount;
    private String locationCityName;
    private Boolean auctionPossible;
    private Boolean exchangePossible;
    private Boolean realtyExchange;
    private String exchangeType;
    private Integer exchangeTypeId;
    private String addDate;
    private String updateDate;
    private String expireDate;
    private Boolean userHideADSStatus;
    @JsonProperty("USD")
    private String usd;
    @JsonProperty("UAH")
    private String uah;
    @JsonProperty("EUR")
    private String eur;
    private Boolean isAutoAddedByPartner;
    private String partnerId;
    private String markName;
    private String markId;
    private String modelName;
    private String modelId;
    private String linkToView;
    private String title;
    private String isLeasing;
    private UserPhoneData userPhoneData;
    private AutoData autoData;
}
