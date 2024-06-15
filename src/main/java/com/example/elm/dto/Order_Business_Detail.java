package com.example.elm.dto;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;


@Data
public class Order_Business_Detail implements Serializable {
    private Integer orderId;
    private String userId;

    private Integer businessId;
    private String businessName;

    private Integer foodId;
    private String foodName;
    private Integer quantity;
    private Double foodPrice;
}