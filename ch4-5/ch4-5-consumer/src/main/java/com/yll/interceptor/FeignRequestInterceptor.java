package com.yll.interceptor;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.*;

/**
 * @className: FeignRequestInterceptor
 * @description: //TODO
 * @author: yys1778
 * @date: Created in 2019/2/26 10:23
 * @modify by: yys1778
 * @version: V1.0
 */
@Component
@Slf4j
public class FeignRequestInterceptor implements RequestInterceptor {

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public void apply(RequestTemplate requestTemplate) {
        // feign 不支持 get 方法传 POJO, json body 转 query
        if (("GET").equals(requestTemplate.method()) && null != requestTemplate.body()) {
            JsonNode jsonNode = null;
            try {
                jsonNode = objectMapper.readTree(requestTemplate.body());
                requestTemplate.body(null);
                Map<String, Collection<String>> queries = new HashMap<>();
                buildQuery(jsonNode, "", queries);
                requestTemplate.queries(queries);
            } catch (IOException e) {
                log.error("解析数据异常", e);
            }
        }
    }

    private void buildQuery(JsonNode jsonNode, String path, Map<String, Collection<String>> queries) {
        // 叶子节点
        if (!jsonNode.isContainerNode()) {
            if (jsonNode.isNull()) {
                return;
            }
            Collection<String> values = queries.get(path);
            if (null == values) {
                 values = new ArrayList<>();
                 queries.put(path, values);
            }
            values.add(jsonNode.asText());
            return;
        }
        if (jsonNode.isArray()) {
            Iterator<JsonNode> nodeIterator = jsonNode.elements();
            while (nodeIterator.hasNext()) {
                buildQuery(nodeIterator.next(), path, queries);
            }
        } else {
            Iterator<Map.Entry<String, JsonNode>> fields = jsonNode.fields();
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> jsonNodeEntry = fields.next();
                if (StringUtils.hasText(path)) {
                    buildQuery(jsonNodeEntry.getValue(), path + "." + jsonNodeEntry.getKey(), queries);
                } else { //根节点
                    buildQuery(jsonNodeEntry.getValue(), jsonNodeEntry.getKey(), queries);
                }
            }
        }

    }
}
