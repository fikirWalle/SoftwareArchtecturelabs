package com.miu.edu.shopserver.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miu.edu.shopserver.model.Product;
import com.miu.edu.shopserver.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product){
       productRepository.insert(product);

        return productRepository.findById(product.getProductNumber()).get();
    }

    public Product getProduct(Integer id) {
        return productRepository.findById(id).get();
    }
}
