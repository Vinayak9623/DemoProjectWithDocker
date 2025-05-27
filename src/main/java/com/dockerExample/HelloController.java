package com.dockerExample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello from docker example";
    }

    @GetMapping("/hi")
    public String sayHi(){
        return "hi from docker example";
    }
}
