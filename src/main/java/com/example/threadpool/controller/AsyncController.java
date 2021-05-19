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
 * 前端控制器
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
        try {
            asyncService.asyncMethod();
            return ResponseResult.success();
        } catch (ResultException e) {
            return ResponseResult.error(e);
        }
    }
}

