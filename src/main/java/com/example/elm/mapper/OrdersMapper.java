package com.example.elm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.elm.domain.Orders;
import com.example.elm.dto.Order_Business_Detail;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrdersMapper extends BaseMapper<Orders> {
    @Insert("insert into orders(userId,businessId,orderDate,orderTotal,daId,orderState) values(#{userId},#{businessId},#{orderDate},#{orderTotal},#{daId},0)")
    @Options(useGeneratedKeys=true,keyProperty="orderId",keyColumn="orderId")
    public int saveOrders(Orders orders);

    @Select("SELECT o.*, b.businessName AS businessName FROM orders o " +
            "LEFT JOIN business b ON o.businessId = b.businessId " +
            "WHERE o.orderId = #{orderId}")
    Orders getOrdersById(Integer orderId);


//    @Select("select * from orders where userId=#{userId}")
//    public List<Orders> listOrdersByUserId(String userId);

    @Select("SELECT o.orderId, o.userId, o.businessId, b.businessName, " +
            "od.foodId, f.foodName, od.quantity, f.foodPrice " +
            "FROM orders o " +
            "LEFT JOIN business b ON o.businessId = b.businessId " +
            "LEFT JOIN orderdetailet od ON o.orderId = od.orderId " +
            "LEFT JOIN food f ON od.foodId = f.foodId " +
            "WHERE o.userId = #{userId}")
    List<Order_Business_Detail> listOrdersByUserId(String userId);

    @Select("SELECT o.orderId, o.userId, o.businessId, b.businessName " +
            "FROM orders o " +
            "LEFT JOIN business b ON o.businessId = b.businessId " +
            "WHERE o.userId = #{userId}")
    List<Order_Business_Detail> listOrderBusinessByUserId(String userId);



}
