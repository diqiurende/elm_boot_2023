package com.example.elm.controller;

import com.example.elm.domain.Food;
import com.example.elm.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/FoodController")
public class FoodController {
    @Autowired
    private FoodService foodService;
    @GetMapping("/listFoodByBusinessId")
    public List<Food> listfoodbybus(@RequestParam Integer bus_id){
        return foodService.listFoodByBUsinessId(bus_id);
    }
}
