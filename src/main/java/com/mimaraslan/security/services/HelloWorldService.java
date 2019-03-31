package com.mimaraslan.security.services;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public HelloWorldService() {}

    public String sayHello() {
        return "Hello World";
    }
}
