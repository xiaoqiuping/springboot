package com.qp.springboot.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Liubity
 * @Date 2018/5/18
 */

@ControllerAdvice
public class ApplicationExceotion {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String,Object> defaultExceptionHandler(Exception e) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("status", "fail");
        map.put("msg", e.getMessage());
        return map;
    }
}
