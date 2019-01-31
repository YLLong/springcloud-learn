package com.yll.controller;

import com.yll.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: HelloFeignController
 * @description: //TODO
 * @author: yys1778
 * @date: Created in 2019/1/31 14:25
 * @modify by: yys1778
 * @version: V1.0
 */
@RestController
public class HelloFeignController {

    @Autowired
    private HelloFeignService helloFeignService;

    @GetMapping(value = "/search/github")
    public ResponseEntity<byte[]> searchGithubRep(@RequestParam("str") String queryStr) {
        return helloFeignService.searchRepo(queryStr);
    }

}
