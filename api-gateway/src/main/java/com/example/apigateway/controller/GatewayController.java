package com.example.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController {

    @GetMapping("/")
    public String home() {
        return "API Gateway for Microservices Order System";
    }
}