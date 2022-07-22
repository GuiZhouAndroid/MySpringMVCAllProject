package com.dhrj.java.zsitking.controller;

import com.dhrj.java.zsitking.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Created: by 2022-07-22 11:24
 * @Description: 请求转发数据发送页面
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @Github: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
@Controller
public class DataController {

    /**
     * 所有形参都是SpringMVC默认内置的对象，不需要自己new，直接使用即可
     */
    @RequestMapping("/myInfo.do")
    public String data(HttpServletRequest request,
                       HttpServletResponse response, //响应对象无法携带参数
                       HttpSession session,
                       Model model,
                       Map map,
                       ModelMap modelMap){

        //生成数据,传到main.jsp页面上
        User u = new User("张松",24);
        //传递数据
        request.setAttribute("requestUser",u);
        session.setAttribute("sessionUser",u);
        model.addAttribute("modelUser",u);
        map.put("mapUser",u);
        modelMap.addAttribute("modelMapUser",u);

        return "main";  //请求转发方式跳转页面
        //return "redirect:/admin/main.jsp"; //使用重定向只有session方式生效，其他方式无法携带数据跳转
    }
}
