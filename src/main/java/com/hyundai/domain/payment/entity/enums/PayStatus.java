package com.hyundai.domain.payment.entity.enums;

/**
 * author : 이소민
 */
public enum PayStatus {
    SUCCESS("결제완료"),
    REFUND("환불완료"),
    WAITING_FOR_PAYMENT("결제대기");
    private String status;

    public String getStatus() {
        return status;
    }

    PayStatus(String status) {
        this.status = status;
    }
}