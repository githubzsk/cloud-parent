package com.xintong.cloudmessage.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AnnotationQuartz {

    @Scheduled(cron = "0/30 * * * *?")
    public void processInitMsg(){

        //定时查询本地订单表中是否已经生成订单，如果已经生成，就把状态改为sent，并把消息发送出去
        //查询消息表中的处于init状态的消息对应的订单id，去查订单表中是否存在，若存在
        // 说明订单已生成（该消息已经为init说明为漏网之鱼），则改本记录为sent状态，并发送消息到消息队列
    }

    @Scheduled(cron = "0/30 * * * *?")
    public void processSentMsg(){
        //接收到ack 也就是对方事务操作完毕后，将该消息的状态改为end状态，表示处理完毕，如果长时间该消息处于
        //sent状态（可能是那边有Bug或者消息丢失，那边没有处理好），就要重新发送消息（那边必须处理好接口幂等性）
        //知道正常ack，若一直无法确定ack，需要人工介入
    }
}
