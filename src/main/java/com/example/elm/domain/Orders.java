package com.example.elm.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@TableName(value = "orders")
@Data
public class Orders implements Serializable {
    @TableId(value = "orderId",type = IdType.AUTO)
    private Integer orderId;
    @TableField(value = "userId")
    private String userId;
    @TableField(value = "businessId")
    private Integer businessId;
    @TableField(value = "orderDate")
    private String orderDate;
    @TableField(value = "orderTotal")
    private Double orderTotal;
    @TableField(value = "daId")
    private Integer daId;
    @TableField(value = "orderState")
    private Integer orderState;

    //多对一
    private Business business;

    //一对多
    private List<OrderDetailet> list;
}
