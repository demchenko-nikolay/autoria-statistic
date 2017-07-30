package com.demchenko.repository;


import com.demchenko.bean.CarBean;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CarBeanRepositoryTest {

    @Autowired
    CarBeanRepository carBeanRepository;

    @Test
    public void testSaveCarBean() {
        CarBean carBean = new CarBean();
        carBean.setId(1l);
        carBeanRepository.save(carBean);
        Assert.assertNotNull(carBeanRepository.findOne(1l));
    }

}
