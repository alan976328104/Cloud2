package com.tmut.controller;

import com.tmut.config.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FeignController {
     @Autowired
    FeignService feignService;
    @RequestMapping("/login")
    public String login(String name,String pwd){
        return feignService.login(name,pwd);
    }

}
