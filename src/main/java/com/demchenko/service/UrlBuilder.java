package com.demchenko.service;

import com.demchenko.bean.UrlBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class UrlBuilder {
    @Autowired
    UrlBean urlBean;

    public String createUri() {
        UriComponents uriComponent = UriComponentsBuilder.newInstance()
                .scheme(urlBean.getScheme())
                .host(urlBean.getHost())
                .path(urlBean.getPath())
                .queryParams(urlBean.getParametersMap())
                .build();
        return uriComponent.toString();
    }
}
