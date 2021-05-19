package com.example.threadpool.controller;



import com.example.threadpool.bean.ResponseResult;
import com.example.threadpool.exception.ResultException;
import com.example.threadpool.service.AsyncService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 患者信息表(每次医保卡验证同时更新) 前端控制器
 * </p>
 *
 * @author auto
 * @since 2020-08-07
 */
@RestController
@RequestMapping("/async")
@Slf4j
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @ResponseBody
    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public ResponseResult async() {
//        log.info("【根据银行下单号获取银行订单信息】参数为");
        try {
//            int count = baPersonService.insertPersonInfo();
//            log.info("【根据银行下单号获取银行订单信息】");
            asyncService.asyncMethod();
            return ResponseResult.success();
        } catch (ResultException e) {
//            log.error("【根据银行下单号获取银行订单信息】错误信息为：", e);
            return ResponseResult.error(e);
        }
    }
}

