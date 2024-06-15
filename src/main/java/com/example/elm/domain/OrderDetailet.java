package com.example.elm.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
@TableName(value = "orderdetaillet")
@Data
public class OrderDetailet implements Serializable {
    @TableId(value = "odId",type = IdType.AUTO)
    private Integer odId;
    @TableField(value = "orderId")
    private Integer orderId;
    @TableField(value = "foodId")
    private Integer foodId;
    @TableField(value = "quantity")
    private Integer quantity;

    private Food food;
}
