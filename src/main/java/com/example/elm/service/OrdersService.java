package com.example.elm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.elm.domain.Orders;
import com.example.elm.dto.Order_Business_Detail;

import java.util.List;

public interface OrdersService extends IService<Orders> {

    public int generateOrders(Orders orders);

    public Orders getOrderById(Integer orderId);
    public List<Order_Business_Detail> listOrdersByuser(String userId);

}
