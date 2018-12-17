package com.springcloud.servicefeign.servicefeign.feign;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "erukaclient")
public interface ServiceFeign {
    @GetMapping("/hi")
    String hi(@RequestParam("name") String name);
}
