package com.hyundai.global.mapper;

import com.hyundai.domain.orders.dto.OrderInfo;
import com.hyundai.domain.orders.entity.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderMapper {
    void insertOrder(Orders orders);

    OrderInfo selectOneOrderInfoByProductId(@Param("productId") Long productId, @Param("productCount") int productCount, @Param("memberId") Long memberId);

    OrderInfo selectOrderInfosByProductId(@Param("productId") Long productId, @Param("memberId") Long memberId);
}
