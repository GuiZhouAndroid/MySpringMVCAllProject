package com.dhrj.java.zsitking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Created: by 2022-07-20 17:32
 * @Description: 提交数据的五种方式
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @Github: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
@Controller
public class DemoController {
    @RequestMapping("/main.do")
    public String index() {
        return "main";
    }
}
