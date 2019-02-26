package com.yll.config;

import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

/**
 * @className: FeignMultipartSupportConfig
 * @description: //feign 文件上传 configuration
 * @author: yys1778
 * @date: Created in 2019/2/26 17:40
 * @modify by: yys1778
 * @version: V1.0
 */
@Configuration
public class FeignMultipartSupportConfig {

    @Bean
    @Primary
    @Scope("prototype")
    public Encoder multipartFormEncoder() {
        return new SpringFormEncoder();
    }

}
