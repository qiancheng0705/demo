package com.qiancheng.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//一个简单的Spring控制器类
//@Controller
@RestController
public class WelcomeController {

	 // inject via application.properties
    private String message = "Hello World";

    @GetMapping("/hello")
    public String hello() {
        return message;
    }
}
