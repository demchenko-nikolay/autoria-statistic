package com.demchenko.service;

import com.demchenko.bean.UrlBean;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource()
public class UrlBuilderTest {
    @Autowired
    UrlBuilder urlBuilder;

}
