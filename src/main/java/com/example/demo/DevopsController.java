package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello this is my cloud devops project!";
    }
}