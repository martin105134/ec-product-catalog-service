package com.example.ecproductcatalogservice;


import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProductRepository extends MongoRepository<Product, Integer> {

    Product findByProductId(String id);
}
