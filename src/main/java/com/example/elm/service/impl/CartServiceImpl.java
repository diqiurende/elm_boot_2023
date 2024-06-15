package com.example.elm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.elm.domain.Cart;
import com.example.elm.dto.Cart_Food;
import com.example.elm.mapper.CartMapper;
import com.example.elm.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl extends ServiceImpl<CartMapper, Cart> implements CartService {
    @Autowired
    private CartMapper cartMapper;
    @Override
    public List<Cart> listCart(Cart cart) {
        return cartMapper.listCart(cart);
    }

    @Override
    public int saveCart(Cart cart) {
        return cartMapper.saveCart(cart);
    }

    @Override
    public int updateCart(Cart cart) {
        return cartMapper.updateCart(cart);
    }

    @Override
    public int removeCart(Cart cart) {
        return cartMapper.removeCart(cart);
    }

    @Override
    public List<Cart_Food> listCartByBusinessIdAndUserId(Integer businessId, String userId) {
        return cartMapper.listCartByBusinessIdAndUserId( businessId, userId);
    }
}
