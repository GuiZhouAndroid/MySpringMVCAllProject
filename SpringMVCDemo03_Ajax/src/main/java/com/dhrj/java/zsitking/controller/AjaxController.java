package com.dhrj.java.zsitking.controller;

import com.dhrj.java.zsitking.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @Created: by 2022-07-21 16:58
 * @Description:
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @Github: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
@Controller
public class AjaxController {
    @RequestMapping("/list.do")
    @ResponseBody //用来解析Ajax的请求，使用此注解，必须在spirngmvc.xml中配置注解驱动
    public List<Student> listStudent() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("张三", 20));
        students.add(new Student("李四", 30));
        students.add(new Student("王五", 40));
        students.add(new Student("赵六", 50));
        return students;//SpirngMVC框架借助jackson会将此集合转为json数组,最终响应到ajax的success(result))形参中
    }
}
