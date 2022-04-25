package com.sahbazremzi.productservice.repository;

import com.sahbazremzi.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
