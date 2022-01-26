package com.example.orderservice.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@ToString
public class OrderEntity {
    @Id
    private int id;
    private String name;
    private int qty;
    private int price;
}
