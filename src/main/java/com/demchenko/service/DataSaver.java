package com.demchenko.service;

import com.demchenko.bean.CarBean;
import com.demchenko.repository.CarBeanRepository;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DataSaver {
    @Autowired
    DataParser dataParser;
    @Autowired
    CarBeanRepository carBeanRepository;

    public static final int A_HUNDRED_ADS_ON_PAGE = 100;

    public void saveAllAvailableAds() throws JSONException, InterruptedException {
        int numberOfPages = dataParser.getNumberOfAds() / A_HUNDRED_ADS_ON_PAGE + 1;
        for (int i = 1; i <= numberOfPages; i++) {
            List<String> listOfIds = dataParser.getAllAdIds(String.valueOf(i));
            for (String id : listOfIds) {
                boolean test = false;
                CarBean carBean = dataParser.getCarBeanById(id);
                carBean.setId(Long.parseLong(id));
                carBeanRepository.save(carBean);
                Thread.sleep(10000l);
                if (test) break;
            }
        }
    }

}
