package com.dhrj.java.zsitking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Created: by 2022-07-22 10:30
 * @Description: 其他控制器
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @Github: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
@Controller
public class OtherController {

    @RequestMapping("/other.do")
    public String other() {
        System.out.println("这是other的do访问 ...");
        return "main";
    }
}
