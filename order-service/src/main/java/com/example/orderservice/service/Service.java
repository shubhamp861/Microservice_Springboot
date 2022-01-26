package com.example.orderservice.service;

import com.example.orderservice.common.RequestDto;
import com.example.orderservice.common.ResponseDto;
import com.example.orderservice.entity.OrderEntity;
import com.example.orderservice.entity.Payment;
import com.example.orderservice.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateRequestCustomizer;
import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    public OrderRepository orderRepository;

    @Autowired

    public RestTemplate restTemplate;

    public ResponseDto saveOrder(RequestDto requestDto){
        String message = null;
        OrderEntity orderEntity = requestDto.getOrderEntity();
        Payment payment = requestDto.getPayment();
        payment.setOrderId(orderEntity.getId());
        payment.setAmount(orderEntity.getPrice());
        Payment paymentRespoonse = restTemplate.postForObject("http://payment/payment/doPayment", payment, Payment.class);
        message = paymentRespoonse.getPaymentStatus().equals("complete")?"Order Placed":"Payment fail!!";
        orderRepository.save(orderEntity);
        return new ResponseDto(orderEntity,paymentRespoonse.getAmount(),paymentRespoonse.getTransctionId(),message);
    }
}
