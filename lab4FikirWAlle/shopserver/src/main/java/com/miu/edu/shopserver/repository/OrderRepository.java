package com.miu.edu.shopserver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.miu.edu.shopserver.model.Order;

public interface OrderRepository extends MongoRepository<Order, Integer> {

}
