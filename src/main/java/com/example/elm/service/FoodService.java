package com.example.elm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.elm.domain.Food;

import java.util.List;

public interface FoodService extends IService<Food> {
    List<Food> listFoodByBUsinessId(Integer businessId);
}
