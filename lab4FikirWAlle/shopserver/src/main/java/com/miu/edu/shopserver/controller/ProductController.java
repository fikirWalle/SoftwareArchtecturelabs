package com.miu.edu.shopserver.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.miu.edu.shopserver.model.Product;
import com.miu.edu.shopserver.service.ProductService;



@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/product/add")
    public ResponseEntity<Product> addProduct(@RequestBody Product product){

        return new ResponseEntity<>(productService.addProduct(product), HttpStatus.OK);
    }
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable("id") Integer id){



        return  new ResponseEntity<>(productService.getProduct(id),HttpStatus.OK);
    }

}
