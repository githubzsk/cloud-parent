package com.xintong.cloudmessage.service;

import com.xintong.cloudmessage.common.Constants;
import com.xintong.cloudmessage.model.Message;
import com.xintong.cloudmessage.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Slf4j
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private IOrderService orderService;

    private IMessageService messageService;

    @Override
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRES_NEW)
    public Order createOrder(Order order) {
        if (order == null){
            throw new RuntimeException("不能为空");
        }
        //各种逻辑校验
        //模拟产生订单id
        String orderId = UUID.randomUUID().toString();

        //创建订单前 初始化消息
        messageService.recMessage(new Message(Constants.MessageStatus.INIT,orderId,Constants.BizType.ORDER_PRODUCT_STOCK,null));
        log.debug("orderID:{}",orderId);
        //产生订单
        Order o = new Order();
        orderService.createOrder(o);
        //确认创建完毕，更改状态，往消息队列中发送一个消息，表示这边执行完毕
        messageService.recMessage(new Message(Constants.MessageStatus.SENT,orderId,Constants.BizType.ORDER_PRODUCT_STOCK,o.toString()));


        return null;
    }
}
