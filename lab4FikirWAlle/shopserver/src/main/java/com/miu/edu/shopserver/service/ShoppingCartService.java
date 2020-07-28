package com.miu.edu.shopserver.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miu.edu.shopserver.model.Item;
import com.miu.edu.shopserver.model.ShoppingCart;
import com.miu.edu.shopserver.repository.ShoppingCartRepository;

@Service
public class ShoppingCartService {
  
    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    public ShoppingCart addItemInShoppingCart(Integer id,Item item) {
        ShoppingCart shoppingCart=shoppingCartRepository.findById(id).get();
        shoppingCart.getItems().add(item);
        shoppingCartRepository.deleteById(shoppingCart.getShoppingCartId());
        shoppingCartRepository.insert(shoppingCart) ;
        return shoppingCartRepository.findById(shoppingCart.getShoppingCartId()).get();
    }

    public ShoppingCart getShoppingCart(Integer id) {
        return shoppingCartRepository.findById(id).get();
    }
}
