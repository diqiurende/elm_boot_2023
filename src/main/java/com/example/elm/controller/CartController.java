package com.example.elm.controller;

import com.example.elm.domain.Cart;
import com.example.elm.dto.Cart_Food;
import com.example.elm.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/CartController")
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping("/listCarts")
    public List<Cart> listCart(@RequestBody Cart cart){
        return cartService.listCart(cart);
    }

    @PostMapping("/listCart")
    public List<Cart_Food> listCarts(@RequestBody Map<String, String> requestBody){
        Integer businessId = Integer.parseInt(requestBody.get("businessId"));
        String userId = requestBody.get("userId");
        return cartService.listCartByBusinessIdAndUserId(businessId, userId);
    }



    @PostMapping("/saveCart")
    public int saveCart(@RequestBody Cart cart){
        return cartService.saveCart(cart);
    }

    @PostMapping("/updateCart")
    public int updateCart(@RequestBody Cart cart){
        return cartService.updateCart(cart);
    }

    @PostMapping("/removeCart")
    public int removeCart(@RequestBody Cart cart){
        return cartService.removeCart(cart);
    }
}
