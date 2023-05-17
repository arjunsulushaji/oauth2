package com.arjunshaji.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/")
    public String home(){
        return "<h1>hello, home ! </h1>";
    }

    @GetMapping("/secure")
    public String secureHome(){
        return "<h1>hello, secure home ! </h1>";
    }
}
