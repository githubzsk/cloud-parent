package com.xintong.cloudmessage.mapper;

import com.xintong.cloudmessage.model.Order;

import java.util.List;

public interface OrderMapper {
    int createOrder(Order order);
    int deleteOrder(int orderId);
    int mergeOrder(Order order);
    Order getById(int orderId);
    List<Order> findAll();
}
