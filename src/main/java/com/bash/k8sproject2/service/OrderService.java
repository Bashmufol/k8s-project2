package com.bash.k8sproject2.service;

import com.bash.k8sproject2.entity.Order;
import com.bash.k8sproject2.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository repo;

    public Order addOrder(Order order) {
        return repo.save(order);
    }

    public List<Order> getOrders() {
        return repo.findAll();
    }

    public Order getOrderById(int id) {
        return repo.findById(id).orElse(null);
    }
}
