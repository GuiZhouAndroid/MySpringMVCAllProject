package com.dhrj.java.zsitking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Created: by 2022-07-22 10:27
 * @Description: 转发和跳转控制器
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @Github: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */

@Controller
public class JumpController {

    @RequestMapping("/one.do")
    public String one() {
        System.out.println("这是请求转发页面跳转...");
        return "main";  //默认是请求转发,使用视图解析器拼接前缀后缀进行页面跳转
    }

    @RequestMapping("/two.do")
    public String two(){
        System.out.println("这是请求转发do跳转.........");
        //  /admin/  /other.do  .jsp
        //forward: 这组字符串可以屏蔽前缀和后缀的拼接.实现请求转发跳转
        return "forward:/other.do";  //默认是请求转发,使用视图解析器拼接前缀后缀进行页面跳转
    }

    @RequestMapping("/three.do")
    public String three() {
        System.out.println("这是重定向页面...");
        //redirect:  这组字符串可以屏蔽前缀和后缀的拼接.实现重定向跳转
        return "redirect:/admin/main.jsp";
    }
    @RequestMapping("/four.do")
    public String four(){
        System.out.println("这是重定向do...");
        //redirect:  这组字符串可以屏蔽前缀和后缀的拼接.实现重定向跳转
        return "redirect:/other.do";
    }
    @RequestMapping("/five.do")
    public String five(){
        System.out.println("这是随便跳.......");
        return "forward:/fore/other.jsp";
    }
}
