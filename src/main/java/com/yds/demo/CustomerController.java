package com.yds.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CustomerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/test")
    public String test() {
        return restTemplate.getForEntity("http://spring-boot-actuator/hello", String.class).getBody();
    }
}
