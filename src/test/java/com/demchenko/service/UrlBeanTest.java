package com.demchenko.service;

import com.demchenko.bean.UrlBean;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest()
@PropertySource("classpath:url.test.properties")
public class UrlBeanTest {
    @Autowired
    UrlBean urlBean;

    @Test
    public void testHost() {
        Assert.assertNotNull(urlBean.getHost());
        Assert.assertEquals("google.com", urlBean.getHost());
    }
}
