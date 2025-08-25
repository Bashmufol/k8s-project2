package com.bash.k8sproject2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    public Order addOrder(){

    }

    public List<Order> getOrders(){

    }
    public Order getOrderById(int id){}
}
