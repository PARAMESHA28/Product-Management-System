package com.inventeron.demo.Repository;

import com.inventeron.demo.DTO.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Productrep extends MongoRepository<Product,String> {

}
