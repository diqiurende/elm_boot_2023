package com.example.elm.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;
@TableName(value = "food")
@Data
public class Food implements Serializable {
    @TableId(value = "foodId",type = IdType.AUTO)
    private Integer foodId;
    @TableField(value = "foodName")
    private String foodName;
    @TableField(value = "foodExplain")
    private String foodExplain;
    @TableField(value = "foodImg")
    private String foodImg;
    @TableField(value = "foodPrice")
    private Double foodPrice;
    @TableField(value = "businessId")
    private Integer businessId;
    @TableField(value = "remarks")
    private String remarks;
}
