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
                System.out.println("保存初始消息");
                break;
            case Constants.MessageStatus.SENT:
                System.out.println("更新消息状态");
                break;
            case Constants.MessageStatus.END:
                break;
            default:
                throw new RuntimeException("消息状态有误");
        }

    }
}
