package com.springcloud.servicefeign.servicefeign.controller;

import com.springcloud.servicefeign.servicefeign.feign.ServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired(required = false)
    ServiceFeign serviceFeign;

    @GetMapping(value = "hi")
    public  String hi(@RequestParam("name") String name){
        return serviceFeign.hi(name);
    }
}
