package com.astronaut.gmall.user.service.impl;


import com.astronaut.gmall.user.bean.UserMemeber;
import com.astronaut.gmall.user.mapper.userMapper;
import com.astronaut.gmall.user.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements userService {

    @Autowired
    userMapper userMapper;

    public String testService(){
        return "hello mapper";
    }

    @Override
    public List<UserMemeber> getAllUser() {
        List<UserMemeber> userMemebers=userMapper.selectAlluser();
        return userMemebers;
    }

}
