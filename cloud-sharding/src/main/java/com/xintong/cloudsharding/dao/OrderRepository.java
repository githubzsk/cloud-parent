package com.xintong.cloudsharding.dao;

import com.xintong.cloudsharding.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
