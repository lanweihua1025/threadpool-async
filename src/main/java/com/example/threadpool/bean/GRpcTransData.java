package com.example.threadpool.bean;

import lombok.Data;
import lombok.ToString;

import java.util.Map;

@Data
@ToString
public class GRpcTransData {

    /**
     * 消息类型
     */
    private String type;
    /**
     * 消息头
     */
    private Map<String, Object> msgHeader;
    /**
     * 消息体
     */
    private Object message;

}
