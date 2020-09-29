package com.tmut.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PayController {
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("/login")
    public String login(String name){
        return  restTemplate.getForObject("http://service-login/user/login?name=zhangsan&pwd=list", String.class);
    }

}
