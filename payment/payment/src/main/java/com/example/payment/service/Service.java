package com.example.payment.service;

import com.example.payment.entity.Payment;
import com.example.payment.repo.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    public PaymentRepo paymentRepo;

    public Payment saveOrder(Payment payment){
        return paymentRepo.save(payment);
    }

    public Payment findPaymentByOrderId(int orderId) {
        return paymentRepo.findByOrderId(orderId);
    }
}
