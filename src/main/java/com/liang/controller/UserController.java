package com.liang.controller;

import com.alibaba.fastjson.JSON;
import com.liang.pojo.User;
import com.liang.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public void addUser(@RequestBody User user){
        userService.insertUser(user);
    }
    @RequestMapping(value = "/findById",method = RequestMethod.GET)
    public String findById(@RequestParam("id") int id){
        User userById = userService.findUserById(id);
        return JSON.toJSONString(userById);
    }
}
