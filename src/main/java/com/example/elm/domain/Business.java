package com.example.elm.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 
 * @TableName business
 */
@TableName(value ="business")
@Data
public class Business implements Serializable {
    /**
     * 商家编号
     */
    @TableId(value = "businessId", type = IdType.AUTO)
    private Integer businessId;

    /**
     * 商家名称
     */
    @TableField(value = "businessName")
    private String businessName;

    /**
     * 商家地址
     */
    @TableField(value = "businessAddress")
    private String businessAddress;

    /**
     * 商家介绍
     */
    @TableField(value = "businessExplain")
    private String businessExplain;

    /**
     * 商家图片（base64）
     */
    @TableField(value = "businessImg")
    private String businessImg;

    /**
     * 点餐分类
     */
    @TableField(value = "orderTypeId")
    private Integer orderTypeId;

    /**
     * 起送费
     */
    @TableField(value = "starPrice")
    private BigDecimal starPrice;

    /**
     * 配送费
     */
    @TableField(value = "deliveryPrice")
    private BigDecimal deliveryPrice;

    /**
     * 备注
     */
    @TableField(value = "remarks")
    private String remarks;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Business other = (Business) that;
        return (this.getBusinessId() == null ? other.getBusinessId() == null : this.getBusinessId().equals(other.getBusinessId()))
            && (this.getBusinessName() == null ? other.getBusinessName() == null : this.getBusinessName().equals(other.getBusinessName()))
            && (this.getBusinessAddress() == null ? other.getBusinessAddress() == null : this.getBusinessAddress().equals(other.getBusinessAddress()))
            && (this.getBusinessExplain() == null ? other.getBusinessExplain() == null : this.getBusinessExplain().equals(other.getBusinessExplain()))
            && (this.getBusinessImg() == null ? other.getBusinessImg() == null : this.getBusinessImg().equals(other.getBusinessImg()))
            && (this.getOrderTypeId() == null ? other.getOrderTypeId() == null : this.getOrderTypeId().equals(other.getOrderTypeId()))
            && (this.getStarPrice() == null ? other.getStarPrice() == null : this.getStarPrice().equals(other.getStarPrice()))
            && (this.getDeliveryPrice() == null ? other.getDeliveryPrice() == null : this.getDeliveryPrice().equals(other.getDeliveryPrice()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBusinessId() == null) ? 0 : getBusinessId().hashCode());
        result = prime * result + ((getBusinessName() == null) ? 0 : getBusinessName().hashCode());
        result = prime * result + ((getBusinessAddress() == null) ? 0 : getBusinessAddress().hashCode());
        result = prime * result + ((getBusinessExplain() == null) ? 0 : getBusinessExplain().hashCode());
        result = prime * result + ((getBusinessImg() == null) ? 0 : getBusinessImg().hashCode());
        result = prime * result + ((getOrderTypeId() == null) ? 0 : getOrderTypeId().hashCode());
        result = prime * result + ((getStarPrice() == null) ? 0 : getStarPrice().hashCode());
        result = prime * result + ((getDeliveryPrice() == null) ? 0 : getDeliveryPrice().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", businessId=").append(businessId);
        sb.append(", businessName=").append(businessName);
        sb.append(", businessAddress=").append(businessAddress);
        sb.append(", businessExplain=").append(businessExplain);
        sb.append(", businessImg=").append(businessImg);
        sb.append(", orderTypeId=").append(orderTypeId);
        sb.append(", starPrice=").append(starPrice);
        sb.append(", deliveryPrice=").append(deliveryPrice);
        sb.append(", remarks=").append(remarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}