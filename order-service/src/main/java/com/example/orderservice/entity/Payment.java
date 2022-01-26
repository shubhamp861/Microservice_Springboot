package com.example.orderservice.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Payment {
    private int paymentId;
    private String paymentStatus;
    private String transctionId;
    private int orderId;
    private int amount;
}
