package ca.cloudace.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    
    @GetMapping("/")
    public String welcome() {
        return "My First Spring boot...";
    }

    @GetMapping("/hello")
    public String hello() {
      return "Welcome to Spring Boot...it's my First app..woohoo";
    }
    

}
