package com.example.elm.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.example.elm.domain.Food;
import lombok.Data;

@Data
public class Cart_Food {


    private Integer cartId;
    private Integer foodId;
    private Integer businessId;
    private String userId;
    private Integer quantity;
    private Food food;

    // Getters and setters



        private String foodName;
        private String foodExplain;
        private String foodImg;
        private Double foodPrice;

        private String remarks;

        // Getters and setters


}
