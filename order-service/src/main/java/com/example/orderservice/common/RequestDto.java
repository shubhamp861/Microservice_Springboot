package com.example.orderservice.common;

import com.example.orderservice.entity.OrderEntity;
import com.example.orderservice.entity.Payment;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class RequestDto {
    private Payment payment;
    private OrderEntity orderEntity;
}

