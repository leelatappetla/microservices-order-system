package com.example.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class OrderController {

    @GetMapping("/orders")
    public Map<String, Object> getOrder() {
        return Map.of(
                "orderId", 101,
                "productName", "Laptop",
                "quantity", 1,
                "status", "PLACED"
        );
    }
}