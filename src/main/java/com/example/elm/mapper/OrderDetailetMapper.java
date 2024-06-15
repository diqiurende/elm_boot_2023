package com.example.elm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.elm.domain.OrderDetailet;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDetailetMapper extends BaseMapper<OrderDetailet> {

    public int saveOrderDetailetBatch(List<OrderDetailet> list);
}
