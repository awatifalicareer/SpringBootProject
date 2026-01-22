package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/")
    public String home() {
        // OLD: "<h1>WELCOME To MyFirstSpringBootProject-get endpoint</h1>"
        return "<h1>HELLO! This is a test update for CI/CD pipeline</h1>";
    }

    // Another syntax to implement a
    // GET method
    @RequestMapping(
            method = { RequestMethod.GET },
            value = { "/gfg" })

    public String info()
    {
        String str2
                = "<html><body><font color=\"green\">"
                + "<h2>Another syntax to implement GET method"
                + "</h2></font></body></html>";
        return str2;
    }
}