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

    // TODO: 29.07.17 Create Enum for these parameters
    public static final boolean SEARCH_PATH = true;
    public static final boolean INFO_PATH = false;

    public List<String> getAllAdIds() throws JSONException {
        List<String> allIds = new LinkedList<>();
        String url = urlBuilder.createSearchUrl();
        String response = dataInvoker.getAllAdIds(url);
        JSONArray jsonArray =  new JSONObject(response).getJSONObject("result").getJSONObject("search_result").getJSONArray("ids");
        for (int i = 0; i < jsonArray.length(); i++) {
            allIds.add(jsonArray.getString(i));
        }
        return allIds;
    }

    public List<CarBean> getAdsByIds(List<String> ids) {
        List<CarBean> carBeans = new LinkedList<>();

        return carBeans;
    }
}
