package com.example.elm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.elm.domain.Cart;
import com.example.elm.dto.Cart_Food;

import java.util.List;

public interface CartService extends IService<Cart> {
    public List<Cart> listCart(Cart cart);
    public int saveCart(Cart cart);

    public int updateCart(Cart cart);

    public int removeCart(Cart cart);

    public List<Cart_Food> listCartByBusinessIdAndUserId(Integer businessId, String userId);
}
