package com.example.elm.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.elm.domain.Business;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author faiz
* @description 针对表【business】的数据库操作Mapper
* @createDate 2024-01-08 22:04:01
* @Entity com.example.elm.domain.Business
*/
@Mapper
public interface BusinessMapper extends BaseMapper<Business> {
    default List<Business> getBusinessBytypeId(Integer typeId) {
        QueryWrapper<Business> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("orderTypeId", typeId);

        return selectList(queryWrapper);
    }
}




