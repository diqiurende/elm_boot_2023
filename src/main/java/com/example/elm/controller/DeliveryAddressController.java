package com.example.elm.controller;

import com.example.elm.domain.DeliveryAddress;
import com.example.elm.service.DeliveryAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/DeliveryAddressController")
public class DeliveryAddressController {
    @Autowired
    private DeliveryAddressService deliveryAddressService;
    @GetMapping("/listDeliveryAddressByUserId")
    public List<DeliveryAddress> listDeliveryByUser(@RequestParam String userId){
        return deliveryAddressService.listDeliveryAddressByUserId(userId);
    }

    @GetMapping("/getDeliveryAddressById")
    public  DeliveryAddress getdabyId(@RequestParam Integer daId){
        return deliveryAddressService.getDeliveryAddressById(daId);
    }
    @PostMapping("/saveDeliveryAddress")
    public int saveDelivery(@RequestBody DeliveryAddress deliveryAddress){
        return deliveryAddressService.saveDeliveryAddress(deliveryAddress);
    }

    @PostMapping("/updateDeliveryAddress")
    public int updateAddress(@RequestBody DeliveryAddress deliveryAddress){
        return deliveryAddressService.updataDeliveryAddress(deliveryAddress);
    }
    @GetMapping("/removeDeliveryAddress")
    public int removeDeliveryAddress(@RequestParam Integer daId){
        return deliveryAddressService.removeDeliveryAddress(daId);
    }
}
