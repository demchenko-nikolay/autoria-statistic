package com.demchenko.service;

import com.demchenko.bean.UrlBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class UrlBuilder {
    @Autowired
    UrlBean urlBean;

    public String createSearchUrl() {
        String path = urlBean.getSearch();
        MultiValueMap<String, String> parameters = urlBean.getParametersMap();
        return createUrl(path, parameters);
    }

    public String createInfoUrl(String adId) {
        String path = urlBean.getInfo();
        MultiValueMap<String, String> parameters = new LinkedMultiValueMap<>();
        parameters.add("api_key", urlBean.getApi_key());
        parameters.add("auto_id", adId);
        return createUrl(path, parameters);
    }

    private String createUrl(String path, MultiValueMap<String, String> parameters) {
        UriComponents uriComponent = UriComponentsBuilder.newInstance()
                .scheme(urlBean.getScheme())
                .host(urlBean.getHost())
                .path(path)
                .queryParams(parameters)
                .build();
        return uriComponent.toString();
    }
}
