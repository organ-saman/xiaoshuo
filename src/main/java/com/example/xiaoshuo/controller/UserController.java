package com.example.xiaoshuo.controller;

import com.example.xiaoshuo.entity.UserInfo;
import com.example.xiaoshuo.service.IUserService;
import com.example.xiaoshuo.vo.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user/")
public class UserController {
    @Resource
    private IUserService iUserService;

    @RequestMapping("login")
    @ResponseBody
    public JsonResult login(UserInfo UserInfo) {
        Boolean login = iUserService.login(UserInfo);
        if(login){
            return new JsonResult(1,"ok","登录成功");
        }else{
            return new JsonResult(1,"ok","登录失败");
        }
    }
    @RequestMapping("save")
    @ResponseBody
    public JsonResult saveUserInfo(UserInfo userInfo){
        Boolean aBoolean = iUserService.saveUserInfo(userInfo);
        if(aBoolean){
            return new JsonResult(1,"ok","注册成功");
        }else{
            return new JsonResult(1,"ok","注册失败");
        }
    }
}
