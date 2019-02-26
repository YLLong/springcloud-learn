package com.yll.service;

import com.yll.config.FeignMultipartSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * @className: FileUploadFeignService
 * @description: //文件上传接口
 * @author: yys1778
 * @date: Created in 2019/2/26 17:52
 * @modify by: yys1778
 * @version: V1.0
 */
@FeignClient(value = "feign-file-server", configuration = FeignMultipartSupportConfig.class)
public interface FileUploadFeignService {

    /**
     * @title: fileUpload
     * @description: //1.produces,consumes必填
     *                 2.注意区分@RequestPart和RequestParam，不要将@RequestPart(value = "file") 写成@RequestParam(value = "file")
     * @author: yys1778
     * @date: Created in 2019/2/26 17:56
     * @param file
     * @throws: 
     * @return: java.lang.String
     */
    @PostMapping(value = "/uploadFile/server", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String fileUpload(@RequestPart(value = "file") MultipartFile file);
}
