package com.example.elm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.elm.domain.Cart;
import com.example.elm.domain.OrderDetailet;
import com.example.elm.domain.Orders;
import com.example.elm.dto.Order_Business_Detail;
import com.example.elm.mapper.CartMapper;
import com.example.elm.mapper.OrderDetailetMapper;
import com.example.elm.mapper.OrdersMapper;
import com.example.elm.service.OrdersService;
import com.example.elm.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper,Orders> implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;
    @Autowired
    private CartMapper cartMapper;
    @Autowired
    private OrderDetailetMapper orderDetailetMapper;
    @Override
    @Transactional
    public int generateOrders(Orders orders) {
        Cart cart = new Cart();
        cart.setUserId(orders.getUserId());
        cart.setBusinessId(orders.getBusinessId());
        List<Cart> cartList = cartMapper.listCart(cart);

        //2、创建订单（返回生成的订单编号）
        orders.setOrderDate(TimeUtil.getCurrentDate());
        ordersMapper.saveOrders(orders);
        int orderId = orders.getOrderId();

        //3、批量添加订单明细
        List<OrderDetailet> list = new ArrayList<>();
        for(Cart c : cartList) {
            OrderDetailet od = new OrderDetailet();
            od.setOrderId(orderId);
            od.setFoodId(c.getFoodId());
            od.setQuantity(c.getQuantity());
            list.add(od);
        }
        orderDetailetMapper.saveOrderDetailetBatch(list);

        //4、从购物车表中删除相关食品信息
        cartMapper.removeCart(cart);

        return orderId;
    }

    @Override
    public Orders getOrderById(Integer orderId) {
        return ordersMapper.getOrdersById(orderId);
    }

    @Override
    public List<Order_Business_Detail> listOrdersByuser(String userId) {
        return ordersMapper.listOrdersByUserId(userId);
    }


}
