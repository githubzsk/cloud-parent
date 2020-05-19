package com.xintong.cloudmessage.service;

import com.xintong.cloudmessage.common.Constants;
import com.xintong.cloudmessage.model.Message;
import com.xintong.cloudmessage.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private IOrderService orderService;

    private IMessageService messageService;

    @Override
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


        return null;
    }
}
