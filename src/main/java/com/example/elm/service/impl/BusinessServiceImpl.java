package com.example.elm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.elm.domain.Business;
import com.example.elm.service.BusinessService;
import com.example.elm.mapper.BusinessMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author faiz
* @description 针对表【business】的数据库操作Service实现
* @createDate 2024-01-08 22:04:01
*/
@Service
public class BusinessServiceImpl extends ServiceImpl<BusinessMapper, Business>
    implements BusinessService{

    @Autowired
    private BusinessMapper businessMapper;

    @Override
    public List<Business> getallbusinessBytypeId(Integer typeId){
        return businessMapper.getBusinessBytypeId(typeId);
    }
    @Override
    public Business getBusinessById(Integer bus_id){
        return businessMapper.selectById(bus_id);
    }

}




