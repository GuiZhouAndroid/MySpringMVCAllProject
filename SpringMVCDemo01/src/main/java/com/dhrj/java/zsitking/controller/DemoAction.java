package com.dhrj.java.zsitking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //交给Spring去创建对象
public class DemoAction {
    @RequestMapping(value = "/demo.action")
    public String demo() {
        System.out.println("demo()执行......");
        return "main";
    }
}
