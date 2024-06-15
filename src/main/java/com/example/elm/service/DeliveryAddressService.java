package com.example.elm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.elm.domain.DeliveryAddress;

import java.util.List;

public interface DeliveryAddressService extends IService<DeliveryAddress> {
    public List<DeliveryAddress> listDeliveryAddressByUserId(String userId);

    public DeliveryAddress getDeliveryAddressById(Integer daId);

    public int saveDeliveryAddress(DeliveryAddress deliveryAddress);

    public int updataDeliveryAddress(DeliveryAddress deliveryAddress);

    public int removeDeliveryAddress(Integer daId);


}
