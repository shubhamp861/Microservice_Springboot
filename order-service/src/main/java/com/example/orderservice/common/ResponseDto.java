package com.example.orderservice.common;

import com.example.orderservice.entity.OrderEntity;
import com.example.orderservice.entity.Payment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class ResponseDto {
    private OrderEntity orderEntity;
    private int amount;
    private String transctionId;
    private String message;
}
