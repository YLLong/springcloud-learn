package com.yll.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @className: SecurityConfig
 * @description: //验证配置 关闭csrf
 * @author: yys1778
 * @date: Created in 2019/1/30 10:59
 * @modify by: yys1778
 * @version: V1.0
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
        http.csrf().disable();
    }

}
