package com.inventeron.demo.Service;

import com.inventeron.demo.DTO.Product;
import com.inventeron.demo.Repository.Productrep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductserviceImpl implements ProductService {

    @Autowired
    Productrep productrep;


    @Override
    public Product addproduct(Product product) {
        return productrep.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productrep.findAll();
     }

    @Override
    public Optional<Product> getById(String id) {
        return productrep.findById(id);
    }

    @Override
    public String deldeteById(String id) {
        productrep.deleteById(id);
    return "Product is deleted :" + id;
    }
}
