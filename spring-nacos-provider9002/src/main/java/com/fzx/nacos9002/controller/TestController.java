package com.fzx.nacos9002.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("getIt/{id}")
    public String getIt(@PathVariable("id") Integer id){
        return "通过端口" + serverPort +" 访问到的id为 " + id;
    }
}
