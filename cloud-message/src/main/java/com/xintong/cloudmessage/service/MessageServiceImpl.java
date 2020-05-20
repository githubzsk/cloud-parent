package com.xintong.cloudmessage.service;

import com.xintong.cloudmessage.common.Constants;
import com.xintong.cloudmessage.model.Message;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MessageServiceImpl implements IMessageService {
    @Override
    @Transactional
    public void recMessage(Message message) {
        if (message == null) {
            throw new RuntimeException("消息为空");
        }
        switch (message.getStatus()) {
            case Constants.MessageStatus.INIT:
                //保存到数据库 初始消息 表示要开始执行某个订单了
                System.out.println("保存初始消息");
                break;
            case Constants.MessageStatus.SENT:
                //更新数据状态，表示业务逻辑已完成，需要发送消息到消息队列
                System.out.println("更新消息状态");
                break;
            case Constants.MessageStatus.END:
                break;
            default:
                throw new RuntimeException("消息状态有误");
        }

    }
}
