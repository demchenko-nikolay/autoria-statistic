package com.demchenko.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//@Ignore
public class DataInvokerTest {
    @Autowired
    DataInvoker dataInvoker;
    @Autowired
    UrlBuilder urlBuilder;

    private String response;

    @Before
    public void invokeUrl() {
        response = dataInvoker.getAllAdIds(urlBuilder.createSearchUrl("1"));
    }

    @Test
    public void testReturnedJson() {
        Assert.assertNotNull(response);
    }

}
