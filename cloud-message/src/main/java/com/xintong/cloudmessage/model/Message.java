package com.xintong.cloudmessage.model;

import lombok.Data;

import java.io.Serializable;
@Data
public class Message implements Serializable {
    private static final long serialVersionUID = 8863270425240881188L;

    //消息id
    private int id;

    //业务ID  例如订单id
    private String bizId;

    //消息类型
    private String bizType;

    //消息数据
    private String bizData;

    //消息状态
    private int status;

    public Message(int status,String bizId, String bizType, String bizData) {
        this.bizId = bizId;
        this.bizType = bizType;
        this.bizData = bizData;
        this.status = status;
    }
}
