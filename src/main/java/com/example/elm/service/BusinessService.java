package com.example.elm.service;

import com.example.elm.domain.Business;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author faiz
* @description 针对表【business】的数据库操作Service
* @createDate 2024-01-08 22:04:01
*/
public interface BusinessService extends IService<Business> {

    List<Business> getallbusinessBytypeId(Integer typeId);
     Business getBusinessById(Integer bus_id);
}
