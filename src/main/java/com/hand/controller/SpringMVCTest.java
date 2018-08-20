package com.hand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/springmvc")
@Controller
public class SpringMVCTest {

    private static final String SUCCESS = "success";


    @RequestMapping("/testRequsetMapping")
    public String testRequsetMapping() {

        System.out.println("testRequestMapping");
        return SUCCESS;
    }


    @RequestMapping(value = "testMethod", method = RequestMethod.POST)
    public String testMethod() {
        System.out.println("test Method");
        return SUCCESS;
    }


    @RequestMapping(value = "testParamsAndHeaders", params = {"username", "age=23"}, headers = {"Accept-Language=zh-CN,zh;q=0.9,en;q=0.8"})
    public String testParamsAndHeaders() {
        System.out.println("testParamsAndHeaders");
        return SUCCESS;

    }


    @RequestMapping("/tsetPathVariable/{id}")
    public String tsetPathVariable(@PathVariable("id") Integer id) {
        System.out.println("tsetPathVariable: " + id);
        return SUCCESS;
    }


    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.GET)
    public String testRESTGet(@PathVariable Integer id) {
        System.out.println("testRest Get: " + id);
        return SUCCESS;
    }


    @RequestMapping(value = "/testRest", method = RequestMethod.POST)
    public String testRESTPost() {
        System.out.println("testRest Post");
        return SUCCESS;
    }


    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.DELETE)
    public String testRESTDelete(@PathVariable Integer id) {
        System.out.println("testRest Delete: " + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.PUT)
    public String testRESTPut(@PathVariable Integer id) {
        System.out.println("testRest Put: " + id);
        return SUCCESS;
    }


    @RequestMapping(value = "/testRequestParam")
    public String testRequestParam(@RequestParam(value = "username") String username, @RequestParam(value = "age", required = false, defaultValue = "0") int age) {
        System.out.println("test RequestParam, username:" + username + ", age: " + age);
        return SUCCESS;
    }


    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept-Language") String al) {
        System.out.println("testRequestHeader: Accept-Language: " + al);
        return SUCCESS;
    }

}
