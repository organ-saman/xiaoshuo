package com.example.xiaoshuo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping("doIndex")
    public String index(){
        return "index";
    }
    @RequestMapping("register")
    public String save(){
        return "register";
    }
}
