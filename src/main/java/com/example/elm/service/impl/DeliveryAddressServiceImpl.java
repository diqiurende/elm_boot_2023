package com.example.elm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.elm.domain.DeliveryAddress;
import com.example.elm.mapper.DeliveryAddressMapper;
import com.example.elm.service.DeliveryAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryAddressServiceImpl extends ServiceImpl<DeliveryAddressMapper, DeliveryAddress> implements DeliveryAddressService {
    @Autowired
    private DeliveryAddressMapper deliveryAddressMapper;
    @Override
    public List<DeliveryAddress> listDeliveryAddressByUserId(String userId) {
        return deliveryAddressMapper.listDeliveryAddressByUserId(userId);
    }

    @Override
    public DeliveryAddress getDeliveryAddressById(Integer daId) {
        return deliveryAddressMapper.getDeliveryAddressById(daId);
    }

    @Override
    public int saveDeliveryAddress(DeliveryAddress deliveryAddress) {
        return deliveryAddressMapper.saveDeliveryAddress(deliveryAddress);
    }

    @Override
    public int updataDeliveryAddress(DeliveryAddress deliveryAddress) {
        return deliveryAddressMapper.updateDeliveryAddress(deliveryAddress);
    }

    @Override
    public int removeDeliveryAddress(Integer daId) {
        return deliveryAddressMapper.removeDeliveryAddress(daId);
    }
}
