package com.springexample.helloworld;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorld {
    @RequestMapping("/")
    public String index(){
        return "Hello world by LNG";
    }
}
