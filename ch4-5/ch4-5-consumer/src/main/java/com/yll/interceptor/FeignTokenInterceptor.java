package com.yll.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @className: FeignTokenInterceptor
 * @description: //Feign统一Token拦截器
 * @author: yys1778
 * @date: Created in 2019/2/26 10:56
 * @modify by: yys1778
 * @version: V1.0
 */
@Component
public class FeignTokenInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        if (null == getHttpServletRequest()) {
            //此处省略日志记录
            return;
        }
        //将获取Token对应的值往下面传
        requestTemplate.header("oauthToken", getHeaders(getHttpServletRequest()).get("oauthToken"));
    }

    /**
     * @param request
     * @title: getHeaders
     * @description: //Feign拦截器拦截请求获取Token对应的值
     * @author: yys1778
     * @date: Created in 2019/2/26 11:02
     * @throws:
     * @return: java.util.Map<java.lang.String   ,   java.lang.String>
     */
    private Map<String, String> getHeaders(HttpServletRequest request) {
        Map<String, String> map = new LinkedHashMap<>();
        Enumeration<String> enumeration = request.getHeaderNames();
        while (enumeration.hasMoreElements()) {
            String key = enumeration.nextElement();
            String value = request.getHeader(key);
            map.put(key, value);
        }
        return map;
    }

    private HttpServletRequest getHttpServletRequest() {
        try {
            return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        } catch (Exception e) {
            return null;
        }
    }
}
