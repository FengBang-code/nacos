package com.fzx.nacos_consumer83.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ActionController {

    @Autowired
    RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @GetMapping("/consumer/{id}")
    public String getIt(@PathVariable("id") Long id){
        return restTemplate.getForObject(serverURL + "/getIt/" + id, String.class);
    }


}
