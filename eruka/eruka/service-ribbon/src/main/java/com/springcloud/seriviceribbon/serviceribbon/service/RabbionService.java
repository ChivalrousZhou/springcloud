package com.springcloud.seriviceribbon.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RabbionService {
    @Autowired
    RestTemplate restTemplate;
    public String hi(String name){
        return  restTemplate.getForObject("http://ERUKACLIENT/hi?name="+name,String.class);
    }
}
