package com.miu.edu.shopserver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.miu.edu.shopserver.model.ShoppingCart;

public interface ShoppingCartRepository extends MongoRepository<ShoppingCart, Integer>{

}
