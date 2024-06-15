package com.example.elm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.elm.domain.Food;
import com.example.elm.mapper.FoodMapper;
import com.example.elm.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl extends ServiceImpl<FoodMapper,Food> implements FoodService {
    @Autowired
    FoodMapper foodMapper;
    @Override
    public List<Food> listFoodByBUsinessId(Integer businessId) {
        return foodMapper.listFoodByBusinessId(businessId);
    }
}
