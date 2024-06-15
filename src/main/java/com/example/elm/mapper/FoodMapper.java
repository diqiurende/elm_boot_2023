package com.example.elm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.elm.domain.Food;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface FoodMapper extends BaseMapper<Food> {
    @Select("select * from food where businessId=#{businessId} order by foodId")
    public List<Food> listFoodByBusinessId(Integer businessId);

    @Select("select * from food where foodId=#{foodId}")
    public Food getFoodById(Integer foodId);
}
