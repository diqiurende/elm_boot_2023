package com.example.elm.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

import java.io.Serializable;
@TableName(value = "deliveryaddress")
@Data
public class DeliveryAddress implements Serializable {
    @TableId(value = "daId",type = IdType.AUTO)
    private Integer daId;
    @TableField(value = "contactName")
    private String contactName;
    @TableField(value = "contactSex")
    private Integer contactSex;
    @TableField(value = "contactTel")
    private String contactTel;
    @TableField(value = "address")
    private String address;
    @TableField(value = "userId")
    private String userId;
}
