package com.example.elm.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
@TableName(value = "cart")
@Data
public class Cart implements Serializable {
    @TableId(value = "cartId",type = IdType.AUTO)
    private Integer cartId;
    @TableField(value = "foodId")
    private Integer foodId;
    @TableField(value = "businessId")
    private Integer businessId;
    @TableField(value = "userId")
    private String userId;
    @TableField(value = "quantity")
    private Integer quantity;

    private Food food;
    private Business business;
}
