package com.astronaut.gmall.user.controller;

import com.astronaut.gmall.user.bean.UserMemeber;
import com.astronaut.gmall.user.service.impl.userServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class userController {

    @Autowired
    userServiceImpl userServiceImpl;

    @RequestMapping("index")
    @ResponseBody
    public String index (){
        return userServiceImpl.testService();
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UserMemeber> getAllUser(){
        List<UserMemeber> userMemebers =userServiceImpl.getAllUser();
        return userMemebers;
    }



}
