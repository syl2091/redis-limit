package com.lege.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lege
 * @Description
 * @create 2022-05-23 11:03
 */
@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(ServiceException.class)
    public Map<String,Object> serviceException(ServiceException e) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("status", 500);
        map.put("message", e.getMessage());
        return map;
    }
}