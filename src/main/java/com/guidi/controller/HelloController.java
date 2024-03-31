package com.guidi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haha
 * @create 2023-06-11 21:46
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){
        return "hello world!";
    }
    //first change
}
