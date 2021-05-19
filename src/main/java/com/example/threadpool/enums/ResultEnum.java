package com.example.threadpool.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {

    SUCCESS(1, "成功"),
    ARGS_ERR(0, "参数错误"),
    NOT_LOGIN(401, "用户未登陆"),
    SYSTEM_ERR(0, "系统错误"),

    OBJECT_NOT_EXIST(101, "操作对象不存在"),
    SEQ_IS_TOP(102,"对象位置已在顶层"),
    SEQ_IS_DOWN(103,"对象位置已在底层"),
    HAVING_ODEVICE(104,"该自助机存在外围设备"),
    NO_DEVICE(105,"未获取到自助机信息"),
    NO_DEVICE_COMFIGURATION(106,"未获取到自助机的配置信息"),

    NOT_TRADE(201,"不存在有此条交易信息,请到窗口处理"),
    NOT_TRADE_PAYCHANNEL(206,"不存在有此条交易信息,请到窗口处理"),
    NOT_ORDER(202,"不存在有此条订单信息，请到窗口处理"),
    NOT_IS_TRADE(203,"不存在有正交易信息,请到窗口处理"),
    NOT_REGISTER(204,"不存在挂号信息,请到窗口处理"),
    NOT_PERSON(205,"病人信息不存在"),
    NOT_UPDATE_PRINT(205,"没有需要更新的记录"),

    HIS_PAYMENT_MAKE_ERROR(301,"his收费申请出错"),
    HIS_PAYMENT_BALANCE_ERROR(302,"his收费确认出错"),
    HIS_NOT_REPORT(303,"his未查到检验检查报告"),
    HIS_NOT_PAYLIST(304,"his未查未收费列表"),
    HIS_NOT_PERSON(305,"his未建档"),

    PAY_PLATFORM_ERROR(501,"支付平台出错，请到窗口处理"),
    NOT_TERMINALNO(502,"终端号错误，未查询到相关信息"),
    BANK_TIMEOUT(503,"银行交易超时")
    ;


    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
