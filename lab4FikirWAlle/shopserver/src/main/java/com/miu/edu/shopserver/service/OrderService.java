package com.miu.edu.shopserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miu.edu.shopserver.model.Order;
import com.miu.edu.shopserver.repository.OrderRepository;


@Service
public class OrderService {
	@Autowired
    private OrderRepository orderRepository;
    public Order addOrder(Order order) {
        return orderRepository.insert(order);
    }

    public Order getOrder(Integer id) {
        return orderRepository.findById(id).get();
    }

}
