package com.yll.service.dataservice;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

/**
 * @className: ProviderServiceCommand
 * @description: //TODO
 * @author: yys1778
 * @date: Created in 2019/4/16 16:35
 * @modify by: yys1778
 * @version: V1.0
 */
public class ProviderServiceCommand extends HystrixCommand<String> {

    private final String userName;

    public ProviderServiceCommand(String userName) {
        super(HystrixCommandGroupKey.Factory.asKey("GroupSC"));
        this.userName = userName;
    }

    @Override
    protected String run() {
        return "spring cloud";
    }

    @Override
    protected String getFallback() {
        return "Filure spring cloud";
    }
}
