package com.demchenko.bean;

import com.demchenko.service.DataInvoker;
import com.demchenko.service.UrlBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CarBeanTest {
    @Autowired
    DataInvoker dataInvoker;
    @Autowired
    UrlBuilder urlBuilder;

    private String infoUrl;

    @Before
    public void buildUrl() {
        infoUrl = urlBuilder.createInfoUrl("20141624");
    }

    @Test
    public void testSimpleAdGetting() {
        CarBean carBean = dataInvoker.getAdInformationById(infoUrl);
        Assert.assertNotNull(carBean);
        Assert.assertNotNull(carBean);
    }


}
