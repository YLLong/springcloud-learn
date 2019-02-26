package com.yll.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @className: ApplicationExceptionAdapter
 * @description: //swagger支持配置
 * @author: yys1778
 * @date: Created in 2019/2/26 10:02
 * @modify by: yys1778
 * @version: V1.0
 */
@Configuration
@EnableWebMvc
public class ApplicationExceptionAdapter implements WebMvcConfigurer {

    /**
     * @title: addResourceHandlers
     * @description: //静态资源处理
     * @author: yys1778
     * @date: Created in 2019/2/26 14:48
     * @param registry
     * @throws:
     * @return: void
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

}
