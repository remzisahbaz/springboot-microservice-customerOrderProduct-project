package com.sahbazremzi.productservice.controller;

import com.sahbazremzi.productservice.model.Product;
import com.sahbazremzi.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@RestController
@RequestScope
@RequestMapping("/products")
@CrossOrigin
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository productRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product create(@RequestBody Product product ){

        return  productRepository.save(product);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Product> getAll( ){

        return  productRepository.findAll();
    }
}
