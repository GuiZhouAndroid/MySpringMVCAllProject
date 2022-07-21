package com.dhrj.java.zsitking.controller;

import com.dhrj.java.zsitking.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @Created: by 2022-07-21 14:15
 * @Description: 数据提交控制器
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @Github: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
@Controller
public class DataSubmitController {
    /**
     * <input type="text" name="myname">
     * <input type="text" name="myage">
     */
    @RequestMapping(value = "/one.do")
    public String one(String myname, int myage) {
        System.out.println("后台接收姓名===" + myname);
        System.out.println("后台接收年龄===" + (myage + 100));
        return "main";
    }

    /**
     * private String name;//姓名
     * private int age;//年龄
     * <input type="text" name="name"><br/>
     * <input type="text" name="age"><br/>
     */
    @RequestMapping(value = "/two.do")
    public String two(User user) {
        System.out.println("后台接收姓名===" + user.getName());
        System.out.println("后台接收年龄===" + (user.getAge() + 100));
        return "main";
    }

    /**
     * /three/张松/24.do
     */
    @RequestMapping(value = "/three/{name}/{age}.do")
    public String three(@PathVariable("name") String myName, @PathVariable("age") int myAge) {
        System.out.println("后台接收姓名===" + myName);
        System.out.println("后台接收年龄===" + (myAge + 100));
        return "main";
    }

    /**
     * <input type="text" name="myname">
     * <input type="text" name="myage">
     */
    @RequestMapping(value = "/four.do")
    public String four(@RequestParam("myname") String name, @RequestParam("myage") int age) {
        System.out.println("后台接收姓名===" + name);
        System.out.println("后台接收年龄===" + (age + 100));
        return "main";
    }

    /**
     * <input type="text" name="myname">
     * <input type="text" name="myage">
     */
    @RequestMapping(value = "/five.do")
    public String five(HttpServletRequest request) {
        System.out.println("后台接收姓名===" + request.getParameter("myname"));
        //获取到参数，需要自己进行类型转换
        System.out.println("后台接收年龄===" + (Integer.parseInt(request.getParameter("myage")) + 100));
        return "main";
    }

    @RequestMapping("/cookie.do")
    public String getCookie(@CookieValue("JSESSIONID") String sessionId){
        System.out.println("后台接收Cookie===" +sessionId);
        return "main";
    }
}
