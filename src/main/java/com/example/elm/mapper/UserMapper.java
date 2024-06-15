package com.example.elm.mapper;

import com.example.elm.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author faiz
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-12-21 15:24:10
* @Entity com.example.elm.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




