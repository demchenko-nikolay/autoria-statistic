package com.demchenko.service;

import com.demchenko.bean.CarBean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DataInvoker {
    // TODO: 29.07.17 Add counter of API invoking because of restriction (1k per an hour)
    RestTemplate restTemplate = new RestTemplate();

    public String getAllAdIds(String uri) {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(uri, String.class);
        return responseEntity.getBody().toString();
    }

    public CarBean getAdInformationById(String uri) {
        CarBean carBean = restTemplate.getForObject(uri, CarBean.class);
        return carBean;
    }

}
