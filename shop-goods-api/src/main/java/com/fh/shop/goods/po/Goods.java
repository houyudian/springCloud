package com.fh.shop.goods.po;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;
import java.math.BigDecimal;

public class Goods implements Serializable {

    private Long id;
    private Long commonId;
    private String productName;
    private BigDecimal price;
    @TableField(exist = false)
    private String prices;
    private Long stock;
    private String specValueInfos;
    private String specValueId;
    private String isHot;
    private String status;
    private String mainImage;

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    public String getPrices() {
        return prices;
    }

    public void setPrices(String prices) {
        this.prices = prices;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCommonId() {
        return commonId;
    }

    public void setCommonId(Long commonId) {
        this.commonId = commonId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public String getSpecValueInfos() {
        return specValueInfos;
    }

    public void setSpecValueInfos(String specValueInfos) {
        this.specValueInfos = specValueInfos;
    }

    public String getSpecValueId() {
        return specValueId;
    }

    public void setSpecValueId(String specValueId) {
        this.specValueId = specValueId;
    }

    public String getIsHot() {
        return isHot;
    }

    public void setIsHot(String isHot) {
        this.isHot = isHot;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
