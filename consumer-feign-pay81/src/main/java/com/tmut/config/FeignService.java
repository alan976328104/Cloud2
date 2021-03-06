package com.tmut.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name="service-login")
public interface FeignService {
    @GetMapping("user/login")

    String login(@RequestParam("name") String name,@RequestParam("pwd") String pwd);
}
