package com.yll.service.dataservice;

import com.netflix.hystrix.exception.HystrixBadRequestException;
import feign.FeignException;
import feign.Response;
import feign.Util;
import feign.codec.ErrorDecoder;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @className: FeignErrorDecoder
 * @description: //TODO
 * @author: yys1778
 * @date: Created in 2019/4/11 17:40
 * @modify by: yys1778
 * @version: V1.0
 */
@Component
public class FeignErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {
        try {
            if (response.status() >= 400 && response.status() <= 499) {
                String err = Util.toString(response.body().asReader());
                return new HystrixBadRequestException(err);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return FeignException.errorStatus(methodKey, response);
    }

}
