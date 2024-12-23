package com.inventeron.demo.Service;

import com.inventeron.demo.DTO.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {
    Product addproduct(@RequestBody Product product);
    public List<Product> getAllProducts();
    public Optional<Product> getById(@PathVariable String id);
    public String deldeteById(String id);
}
