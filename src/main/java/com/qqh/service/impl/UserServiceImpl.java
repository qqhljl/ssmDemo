package com.qqh.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qqh.dao.UserMapper;
import com.qqh.model.User;
import com.qqh.service.UserService;

@Service("userService")  
public class UserServiceImpl implements UserService {  
    @Resource  
    private UserMapper userMapper;  
    
    public User getUserById(int userId) {  
        return userMapper.get(userId);  
    }  
  
}  
