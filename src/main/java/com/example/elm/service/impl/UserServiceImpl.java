package com.example.elm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.elm.domain.User;
import com.example.elm.service.UserService;
import com.example.elm.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author faiz
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-12-21 15:24:10
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




