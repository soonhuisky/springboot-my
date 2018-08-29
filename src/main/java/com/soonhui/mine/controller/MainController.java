package com.soonhui.mine.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
//注意这里不能用RestController，因为RestController默认返回的是Json数据，如果加了那返回的就是index

public class MainController {

    //首先，浏览器访问 localhost:8080，后台controller拦截该请求，
    // 进行相应的处理（此处无），再跳转到视图 index.html进行显示.
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}
