package com.eliasspringi.ecommerce.controller;


import com.eliasspringi.ecommerce.model.Product;
import com.eliasspringi.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class controller {


@Autowired
private ProductRepository productRepository;

@GetMapping
public List<Product> getAllProducts() {
    return productRepository.findAll();
}
@PostMapping
public Product createProduct(@RequestBody Product product) {
    return productRepository.save(product);
}


}
