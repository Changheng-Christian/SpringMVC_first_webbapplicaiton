package com.hand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld { 
    String successurl = "success";

    /**
     * 使用RequestMapping注解来影射请求的url
     * @return
     */
    @RequestMapping("/helloWorld")
    public String hello(){

        System.out.println("Controller configuration successfully.");
        return successurl;
    }
}
