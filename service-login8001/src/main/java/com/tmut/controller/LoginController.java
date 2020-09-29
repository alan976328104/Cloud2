package com.tmut.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class LoginController {

    @RequestMapping("/login")
    public  String login(String name,String pwd){
        return "{name:"+name+",pwd:"+pwd+",status:登录成功8001}";
    }
}
