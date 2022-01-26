package com.example.APIGateWAy.Api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class Restcontroller {

    @RequestMapping("/orderFail")
    public Mono<String> orderSer(){
        return Mono.just("Order service taking too long time to response, try again later");
    }
    @RequestMapping("/paymentFail")
    public Mono<String> paymentSer(){
        return Mono.just("Payment service taking too long time to response, try again later");
    }
}
