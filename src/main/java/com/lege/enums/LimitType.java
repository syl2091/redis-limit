package com.lege.enums;

/**
 * @author lege
 * @Description
 * @create 2022-05-23 9:28
 */
public enum LimitType {
    /**
     * 默认策略全局限流
     */
    DEFAULT,
    /**
     * 根据请求者IP进行限流
     */
    IP
}
