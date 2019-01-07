package com.yll.config;

import com.netflix.discovery.EurekaClientConfig;
import com.netflix.eureka.EurekaServerConfig;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EurekaServerConfigBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

/**
 * @className: RegionConfig
 * @description: //TODO
 * @author: yys1778
 * @date: Created in 2019/1/7 17:58
 * @modify by: yys1778
 * @version: V1.0
 */
@Configuration
@AutoConfigureBefore(EurekaClientAutoConfiguration.class)
public class RegionConfig {

    @Bean
    @ConditionalOnMissingBean
    public EurekaServerConfig eurekaServerConfig(EurekaClientConfig clientConfig) {
        EurekaServerConfigBean server = new EurekaServerConfigBean();
        if (clientConfig.shouldRegisterWithEureka()) {
            server.setRegistrySyncRetries(5);
        }
        server.setRemoteRegionAppWhitelist(new HashMap<>());
        return server;
    }

}
