package com.example.elm.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.elm.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.elm.domain.*;
@RestController
@RequestMapping("/UserController")
@CrossOrigin(origins = "http://localhost:5173/register")
public class


UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/getUserById")
    public User getUserId(@RequestParam String userId){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("userId",userId);
        User user = userMapper.selectOne(queryWrapper);

        // 添加日志语句
        System.out.println("User found: " + user);
        return userMapper.selectOne(queryWrapper);

    }
    @PostMapping("/saveUser")
    public String saveUser(@RequestBody User user) {
        try {
            // 执行插入操作
            userMapper.insert(user);

            return "User saved successfully!";
        } catch (Exception e) {
            // 记录异常信息到日志
            e.printStackTrace();
            return "Error saving user: " + e.getMessage();
        }
    }


    @GetMapping("/getUserByIdbyPass")
    public String getUserByIdbyPass(@RequestParam String userId,@RequestParam String password){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("userId",userId).eq("password",password);
        User user=userMapper.selectOne(queryWrapper);
        return String.valueOf(user);



    }
}