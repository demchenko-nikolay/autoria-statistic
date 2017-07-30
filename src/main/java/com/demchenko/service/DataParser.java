package com.demchenko.service;

import com.demchenko.bean.CarBean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class DataParser {

    @Autowired
    DataInvoker dataInvoker;
    @Autowired
    UrlBuilder urlBuilder;

    public Integer getNumberOfAds() throws JSONException {
        String url = urlBuilder.createSearchUrl("1");
        String response = dataInvoker.getAllAdIds(url);
        Integer numberOfAds =  new JSONObject(response).getJSONObject("result").getJSONObject("search_result").getInt("count");
        return numberOfAds;
    }

    public List<String> getAllAdIds(String page) throws JSONException {
        List<String> allIds = new LinkedList<>();
        String url = urlBuilder.createSearchUrl(page);
        String response = dataInvoker.getAllAdIds(url);
        JSONArray jsonArray =  new JSONObject(response).getJSONObject("result").getJSONObject("search_result").getJSONArray("ids");
        for (int i = 0; i < jsonArray.length(); i++) {
            allIds.add(jsonArray.getString(i));
        }
        return allIds;
    }

    public CarBean getCarBeanById(String id) {
        String url = urlBuilder.createInfoUrl(id);
        CarBean carBean = dataInvoker.getAdInformationById(url);
        return carBean;
    }
}
