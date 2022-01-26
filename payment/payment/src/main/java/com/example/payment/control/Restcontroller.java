package com.example.payment.control;
import com.example.payment.entity.Payment;
import com.example.payment.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Random;
import java.util.UUID;

@RestController
@RequestMapping("/payment")
public class Restcontroller {
    @Autowired
    private Service ser;

    @PostMapping("/doPayment")
    public Payment dpPayment(@RequestBody Payment payment){
        payment.setTransctionId(UUID.randomUUID().toString());
        payment.setPaymentStatus((new Random().nextBoolean()?"fail":"complete"));
        return ser.saveOrder(payment);
    }

    @GetMapping("/{orderId}")
    public Payment findpayment(@PathVariable int orderId){
        return ser.findPaymentByOrderId(orderId);
    }
}
