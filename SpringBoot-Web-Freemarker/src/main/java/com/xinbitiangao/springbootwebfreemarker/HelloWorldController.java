package com.xinbitiangao.springbootwebfreemarker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.Map;

@Controller
public class HelloWorldController {

    private String message = "Hello World 测试";

    @GetMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.message);
        return "HelloWorld";
    }

    @GetMapping("/hello")
    public String HelloWorld( Map<String, Object> model) {
        model.put("hello", "Hello");
        model.put("world", "World");
       // model.put("time", new Date());
        model.put("time", new Date());
        return "hello";
    }

}
