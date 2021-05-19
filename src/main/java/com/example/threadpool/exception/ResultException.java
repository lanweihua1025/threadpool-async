package com.example.threadpool.exception;


import com.example.threadpool.enums.ResultEnum;
import lombok.Getter;

@Getter
public class ResultException extends RuntimeException {

    private Integer code;

    public ResultException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ResultException(ResultEnum enums) {
        super(enums.getMessage());
        this.code = enums.getCode();
    }

}
