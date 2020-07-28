package com.miu.edu.shopserver.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.miu.edu.shopserver.model.Stock;
import com.miu.edu.shopserver.service.StockService;

@RestController
public class StockController {
    @Autowired
    private StockService stockService;

    @PostMapping("/stock/add")
    public ResponseEntity<Stock> addStoke(@RequestBody Stock stock){

        return new ResponseEntity<>(stockService.addStoke(stock), HttpStatus.OK);
    }
}
