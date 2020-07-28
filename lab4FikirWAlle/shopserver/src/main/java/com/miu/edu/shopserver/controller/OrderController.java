package com.miu.edu.shopserver.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.miu.edu.shopserver.model.Order;
import com.miu.edu.shopserver.service.OrderService;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    
    @GetMapping("/order/{id}")
    public  ResponseEntity<Order> getOrder (@PathVariable("id") Integer id){
        return new ResponseEntity<>(orderService.getOrder(id),HttpStatus.OK);
    }
    
    @PostMapping("/order/save")
    public ResponseEntity<Order> addOrder(@RequestBody Order order){
        return new ResponseEntity<>(orderService.addOrder(order), HttpStatus.OK);
    }
  
}
