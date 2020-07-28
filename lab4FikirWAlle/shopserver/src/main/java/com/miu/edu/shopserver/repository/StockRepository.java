package com.miu.edu.shopserver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.miu.edu.shopserver.model.Stock;

public interface StockRepository extends MongoRepository<Stock, Integer> {

}
