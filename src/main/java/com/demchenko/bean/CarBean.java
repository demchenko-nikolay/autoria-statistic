package com.demchenko.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

// TODO: 29.07.17 Analyze data types and migrate to another database
@Data
@Entity
public class CarBean implements Serializable {
    @Id
    private Long id;
    private String userId;
    private String chipsCount;
    private String locationCityName;
    private Boolean auctionPossible;
    private Boolean exchangePossible;
    private Boolean realtyExchange;
    private String exchangeType;
    private String exchangeTypeId;
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
    @Embedded
    private UserPhoneData userPhoneData;
    @Embedded
    private AutoData autoData;

    public void setId(Long id) {
        this.id = id;
    }
}
