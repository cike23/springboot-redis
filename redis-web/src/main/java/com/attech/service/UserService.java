package com.attech.service;

import com.attech.dao.UserMapper;
import com.attech.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户服务类
 *
 * @author Aaron
 * @version v1.0
 * @create 2018-07-06 16:51
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public User findById(String id) {
        return userMapper.findById(id);
    }

    public int addUser(String name, String age, String password) {
        return userMapper.addUser(name, age, password);
    }

    public void updataById(String id, String name) {
        userMapper.updataById(id, name);
    }

    public void deleteById(String id) {
        userMapper.deleteById(id);
    }

}