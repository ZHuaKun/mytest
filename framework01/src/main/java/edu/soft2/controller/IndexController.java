package edu.soft2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class IndexController {
    //1.接受处理数据
    //2.调用业务逻辑(n/a)
    //3.页面跳转
    @RequestMapping(value = "/sayHello")
    public String sayHello(){
        //接收处理，调用业务，跳转页面
        System.out.println("hello,springmvc");
        //url:/WEB=INF/pages/success.jsp
        return "success";//页面跳转(与视图解析器的前后缀拼接出url)
        //默认用forward转发的方式跳转
    }
    @RequestMapping("/sayHi")
    public String sayHi(){
        System.out.println("----sayHi()----");
        return "Hi";
    }
}