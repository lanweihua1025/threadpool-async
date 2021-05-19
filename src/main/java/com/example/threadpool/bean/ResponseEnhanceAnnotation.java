package com.example.threadpool.bean;

import java.lang.annotation.*;

/**
 * 用于增强返回值，如果方法上标明使用该注解，则请求返回值会封装在ResponseResult对象的data中返回
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ResponseEnhanceAnnotation {

}
