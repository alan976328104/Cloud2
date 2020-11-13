package com.tmut.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.tmut.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class payController {
    @Autowired
    FeignService service;


    @RequestMapping("/consumer/hystrix/login")
    @HystrixCommand(fallbackMethod = "callbackerr",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="1500")
    })
   public  String login(String name) throws Exception {
        if(name==null){
                throw new Exception();

        }
        return service.login(name,"123");
    }

   public String callbackerr( String name){
        return "服务器出错稍后重试";
    }

}
