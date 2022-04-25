package com.remzisahbaz.microserviceproject.repository;

import com.remzisahbaz.microserviceproject.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository  extends MongoRepository<Product,String> {

}
