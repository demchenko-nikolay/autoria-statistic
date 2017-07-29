package com.demchenko.bean;

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
public class UrlBeanTest {
    @Autowired
    UrlBean urlBean;

    @Test
    public void testHostSchemaPath() {
        Assert.assertEquals("developers.ria.com", urlBean.getHost());
        Assert.assertEquals("https", urlBean.getScheme());
        Assert.assertEquals("auto/search", urlBean.getSearch());
    }

    @Test
    public void testParameters() {
        Assert.assertTrue(urlBean.getParam().containsKey("gearbox.4"));
    }
}
