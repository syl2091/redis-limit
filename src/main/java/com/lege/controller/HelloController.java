package com.lege.controller;

import com.lege.anno.RateLimiter;
import com.lege.enums.LimitType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author lege
 * @Description
 * @create 2022-05-23 11:28
 */
@RestController
@RequestMapping(value = "/")
public class HelloController {
    @GetMapping("/hello")
    @RateLimiter(time = 5, count = 3, limitType = LimitType.IP)
    public String hello() {
        return "hello>>>" + new Date();
    }
}