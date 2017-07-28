package com.demchenko.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.Map;

@ConfigurationProperties(prefix = "url")
@Component
public class UrlBean {
    private String scheme;
    private String host;
    private String path;
    private Map<String, String> param;

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public MultiValueMap<String, String> getParametersMap() {
        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.setAll(this.param);
        return map;
    }

    public Map<String, String> getParam() {
        return param;
    }

    public void setParam(Map<String, String> param) {
        this.param = param;
    }
}
