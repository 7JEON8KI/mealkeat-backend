package com.hyundai.domain.orders.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * author : 이소민
 */

@Getter
@NoArgsConstructor
public class OrderInfo {
    private Long productId;
    private String productName;
    private int price;
    private int productCount;
    private int productDiscount;

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }
}
