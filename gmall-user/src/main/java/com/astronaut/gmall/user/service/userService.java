package com.astronaut.gmall.user.service;

import com.astronaut.gmall.user.bean.UserMemeber;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface userService {
    public String testService();

    List<UserMemeber> getAllUser();
}
