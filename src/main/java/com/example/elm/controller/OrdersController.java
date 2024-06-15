package com.example.elm.controller;

import com.example.elm.domain.Orders;
import com.example.elm.dto.Order_Business_Detail;
import com.example.elm.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/OrdersController")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    @PostMapping("/generateOrders")
    public int generateorder(@RequestBody Orders orders){
        return ordersService.generateOrders(orders);
    }
    @GetMapping("/getOrdersById")
    public Orders getOrdersById(@RequestParam Integer orderId){
        return ordersService.getOrderById(orderId);
    }

    @GetMapping("/listOrdersByUserId")
    public List<Order_Business_Detail> listOrdersByUserId(@RequestParam String userId) {
        return ordersService.listOrdersByuser(userId);
    }
}
