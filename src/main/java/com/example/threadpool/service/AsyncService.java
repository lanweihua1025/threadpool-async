package com.example.threadpool.service;

import org.springframework.scheduling.annotation.Async;

@Async("asyncServiceExecutor")
public interface AsyncService {
    //异步方法
    void asyncMethod() ;
}
