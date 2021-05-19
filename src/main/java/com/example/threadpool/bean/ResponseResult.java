package com.example.threadpool.bean;


import com.example.threadpool.enums.ResultEnum;
import com.example.threadpool.exception.ResultException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseResult<T> {

    private Integer code;

    private String msg;

    private Object data;
    
    public static<T> ResponseResult<T> success() {
        ResponseResult<T> result = new ResponseResult<T>();
        result.setCode(1);
        result.setData(null);
        result.setMsg("成功");
        return result;
    }

    public static<T> ResponseResult<T> success(Object data) {
        ResponseResult<T> result = new ResponseResult<T>();
        result.setCode(1);
        result.setData(data);
        result.setMsg("成功");
        return result;
    }
    
    public static<T> ResponseResult<T> error(ResultEnum resultEnum) {
        ResponseResult<T> result = new ResponseResult<T>();
        result.setCode(resultEnum.getCode());
        result.setData(null);
        result.setMsg(resultEnum.getMessage());
        return result;
    }

    public static<T> ResponseResult<T> error(ResultException exception) {
        ResponseResult<T> result = new ResponseResult<T>();
        result.setCode(exception.getCode());
        result.setData(null);
        result.setMsg(exception.getMessage());
        return result;
    }

    public static<T> ResponseResult<T> error(Exception exception) {
        ResponseResult<T> result = new ResponseResult<T>();
        result.setCode(ResultEnum.SYSTEM_ERR.getCode());
        result.setData(exception);
        result.setMsg(ResultEnum.SYSTEM_ERR.getMessage());
        return result;
    }

    public static<T> ResponseResult<T> error(Integer code, String msg) {
    	ResponseResult<T> result = new ResponseResult<T>();
        result.setCode(code);
        result.setData(null);
        result.setMsg(msg);
        return result;
    }


    public static<T> ResponseResult<T> error() {
    	ResponseResult<T> result = new ResponseResult<T>();
        result.setCode(ResultEnum.SYSTEM_ERR.getCode());
        result.setData(null);
        result.setMsg(ResultEnum.SYSTEM_ERR.getMessage());
        return result;
    }

    public static  ResponseResult error(String msg) {
        ResponseResult result = new ResponseResult();
        result.setCode(ResultEnum.SYSTEM_ERR.getCode());
        result.setData(null);
        result.setMsg(msg);
        return result;
    }
}
