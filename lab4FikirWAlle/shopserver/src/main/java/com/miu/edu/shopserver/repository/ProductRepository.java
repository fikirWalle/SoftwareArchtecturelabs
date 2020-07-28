package com.miu.edu.shopserver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.miu.edu.shopserver.model.Product;

public interface ProductRepository extends MongoRepository<Product, Integer> {

}
