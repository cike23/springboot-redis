package com.attech.web;

import com.attech.entity.User;
import com.attech.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制类
 *
 * @author Aaron
 * @version v1.0
 * @create 2018-07-06 16:53
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/adduser")
    public int addUser(@RequestParam("name") String name, @RequestParam("age") String age,
                       @RequestParam("password") String password) {
        return userService.addUser(name, age, password);
    }

    @RequestMapping("/findUser")
    public User findUser(@RequestParam("id") String id) {
        return userService.findById(id);
    }

    @RequestMapping("/updataById")
    public String updataById(@RequestParam("id") String id, @RequestParam("name") String name) {
        try {
            userService.updataById(id, name);
        } catch (Exception e) {
            return "error";
        }
        return "success";
    }

    @RequestMapping("/deleteById")
    public String deleteById(@RequestParam("id") String id) {
        try {
            userService.deleteById(id);
        } catch (Exception e) {
            return "error";
        }
        return "success";
    }

}