package com.dhrj.java.zsitking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller  //交给Spring去创建对象
public class DemoAction {

    @RequestMapping(value = "/demo.action")
    public String demo() {
        System.out.println("demo()执行......");
        return "main";
    }

    @RequestMapping(value = "/request.action", method = RequestMethod.POST)
    public String requestPost() {
        System.out.println("Post()执行......");
        return "main";
    }

    @RequestMapping(value = "/request.action", method = RequestMethod.GET)
    public String requestGet() {
        System.out.println("Get()执行......");
        return "main";
    }
}
