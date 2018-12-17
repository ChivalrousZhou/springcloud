package com.springcloud.seriviceribbon.serviceribbon.controller;

import com.springcloud.seriviceribbon.serviceribbon.service.RabbionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {
    @Autowired
    RabbionService rabbionService;
    @GetMapping("/hi")
    public String hi(@RequestParam(required = false,defaultValue = "forezp") String name){
        return rabbionService.hi(name);
    }

}
