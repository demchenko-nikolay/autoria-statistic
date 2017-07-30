package com.demchenko.repository;

import com.demchenko.bean.CarBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarBeanRepository extends CrudRepository<CarBean, Long> {
}
