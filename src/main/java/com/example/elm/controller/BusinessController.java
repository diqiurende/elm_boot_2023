package com.example.elm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.elm.mapper.BusinessMapper;
import com.example.elm.mapper.UserMapper;
import com.example.elm.service.BusinessService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.elm.domain.*;

import java.util.List;

@RestController
@RequestMapping("/BusinessController")
@CrossOrigin(origins = "http://localhost:5173")
public class BusinessController {
    @Autowired
    private BusinessService businessService;

    @GetMapping("/getAllBusinesses")
    public List<Business> getAllBusinessesByTypeId(@RequestParam Integer typeId) {
      return businessService.getallbusinessBytypeId(typeId);
    }
    @GetMapping("/getBusinessById")
    public Business getBusinessById(@RequestParam Integer bus_id){
        return businessService.getBusinessById(bus_id);
    }
}
