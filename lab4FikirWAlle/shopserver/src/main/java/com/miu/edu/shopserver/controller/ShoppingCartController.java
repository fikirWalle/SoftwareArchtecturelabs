package com.miu.edu.shopserver.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.miu.edu.shopserver.model.Item;
import com.miu.edu.shopserver.model.ShoppingCart;
import com.miu.edu.shopserver.service.ShoppingCartService;

@RestController
public class ShoppingCartController {
    @Autowired
    private ShoppingCartService shoppingCartService;
    @PostMapping("/cart/{id}/add")
    public ResponseEntity<ShoppingCart> addInShppingCart(@PathVariable("id") Integer id, @RequestBody Item item){

        return new ResponseEntity<>(shoppingCartService.addItemInShoppingCart(id,item), HttpStatus.OK);
    }
    @GetMapping("/car/{id}")
    public ResponseEntity<ShoppingCart> getShoppingCart(@PathVariable("id") Integer id){

        return  new ResponseEntity<>(shoppingCartService.getShoppingCart(id),HttpStatus.OK);
    }
}
