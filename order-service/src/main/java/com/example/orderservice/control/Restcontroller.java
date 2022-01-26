package com.example.orderservice.control;

import com.example.orderservice.common.RequestDto;
import com.example.orderservice.common.ResponseDto;
import com.example.orderservice.entity.OrderEntity;
import com.example.orderservice.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class Restcontroller {
    @Autowired
    private Service ser;

    @PostMapping("/bookOrder")
    public ResponseDto bookOrder(@RequestBody RequestDto requestDto){
        return ser.saveOrder(requestDto);
    }
}
