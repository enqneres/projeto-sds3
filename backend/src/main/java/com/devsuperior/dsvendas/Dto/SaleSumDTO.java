package com.devsuperior.dsvendas.Dto;

import com.devsuperior.dsvendas.Entities.Seller;

import java.io.Serializable;

public class SaleSumDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String sellerName;
    private Double sum;

    public SaleSumDTO() {
    }

    public SaleSumDTO(Seller seller, Double sum) {
        this.sellerName = seller.getName();
        this.sum = sum;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
