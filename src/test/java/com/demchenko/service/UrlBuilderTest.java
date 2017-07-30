package com.demchenko.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UrlBuilderTest {
    @Autowired
    UrlBuilder urlBuilder;

    @Test
    public void testCreatedUrl() {
        String url = urlBuilder.createSearchUrl("1");
        Assert.assertNotNull(url);
        Assert.assertTrue(url.startsWith("https"));
        Assert.assertTrue(url.contains("api_key=aChgT7mzZKxEM9LXuB3qnPCanyvFwkovnkr7EOPT"));
    }

    @Test
    public void testInfoPath() {
        String url = urlBuilder.createInfoUrl("1234");
        Assert.assertNotNull(url);
        Assert.assertTrue(url.contains("api_key=aChgT7mzZKxEM9LXuB3qnPCanyvFwkovnkr7EOPT"));
        Assert.assertTrue(url.contains("/auto/info"));
    }

    @Test
    public void testSearchPath() {
        String url = urlBuilder.createSearchUrl("1");
        Assert.assertNotNull(url);
        Assert.assertTrue(url.contains("api_key=aChgT7mzZKxEM9LXuB3qnPCanyvFwkovnkr7EOPT"));
        Assert.assertTrue(url.contains("/auto/search"));
    }

}
