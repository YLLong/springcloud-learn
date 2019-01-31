package com.yll.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @className: HelloFeignServiceConfig
 * @description: //配置feign日志级别
 * @author: yys1778
 * @date: Created in 2019/1/31 14:17
 * @modify by: yys1778
 * @version: V1.0
 */
@Configuration
public class HelloFeignServiceConfig {

    /**
     * @title: feignLoggerLevel
     * @description: Logger.Level 的具体级别如下：
     *                  NONE：不记录任何信息
     *                  BASIC：仅记录请求方法、URL以及响应状态码和执行时间
     *                  HEADERS：除了记录 BASIC级别的信息外，还会记录请求和响应的头信息
     *                  FULL：记录所有请求与响应的明细，包括头信息、请求体、元数据
     * @author: yys1778
     * @date: Created in 2019/1/31 14:19
     * @param 
     * @throws: 
     * @return: feign.Logger.Level
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

}
