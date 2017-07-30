package com.demchenko.bean;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class UserPhoneData {
    private String phoneId;
    private String phone;
}
