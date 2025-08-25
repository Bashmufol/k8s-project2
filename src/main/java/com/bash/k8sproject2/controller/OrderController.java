package com.bash.k8sproject2.controller;

import com.bash.k8sproject2.entity.Order;
import com.bash.k8sproject2.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/add-order")
    public Order addOrder(@RequestBody Order order){
        return orderService.addOrder(order);
    }

    @GetMapping("/get-orders")
    public List<Order> getOrders(){
        return orderService.getOrders();
    }

    @GetMapping("/get-orders/{id}")
    public Order getOrderById(@PathVariable int id){
        return orderService.getOrderById(id);
    }
}
