package com.example.elm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.elm.domain.Cart;
import com.example.elm.dto.Cart_Food;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface CartMapper extends BaseMapper<Cart> {

    @Select("SELECT cart.cartId, cart.foodId, cart.businessId, cart.userId, cart.quantity, " +
            "       food.foodId AS food_foodId, food.foodImg AS food_foodImg, " +
            "       food.foodName AS food_foodName, food.foodPrice " +
            "FROM cart " +
            "LEFT JOIN food ON cart.foodId = food.foodId " +
            "WHERE cart.businessId = #{businessId} " +
            "  AND cart.userId = #{userId}")
    public List<Cart> listCart(Cart cart);

    public List<Cart_Food> listCartByBusinessIdAndUserId(Integer businessId, String userId);

    @Insert("insert into cart values(null,#{foodId},#{businessId},#{userId},1)")
    public int saveCart(Cart cart);

    @Update("update cart set quantity=#{quantity} where foodId=#{foodId} and businessId=#{businessId} and userId=#{userId}")
    public int updateCart(Cart cart);

    public int removeCart(Cart cart);
}
