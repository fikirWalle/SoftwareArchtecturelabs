package com.miu.edu.shopserver.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miu.edu.shopserver.model.Stock;
import com.miu.edu.shopserver.repository.StockRepository;

@Service
public class StockService {
@Autowired
private StockRepository stokeRepository;

    public Stock addStoke(Stock stock) {
        stokeRepository.insert(stock);
        return stokeRepository.findById(stock.getStockId()).get();
    }
}
