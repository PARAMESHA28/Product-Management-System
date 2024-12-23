package com.inventeron.demo.Controller;

import com.inventeron.demo.DTO.Product;
import com.inventeron.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin("http://127.0.0.1:5500")
@RestController
@RequestMapping("/products")
public class Productcontroller {


    @Autowired
    ProductService productService;


    @PostMapping
    public Product addProduct(@RequestBody Product product)  {
        return productService.addproduct(product);
    }

    @GetMapping("/getall")
    public List<Product> getAllProducts(){
       return productService.getAllProducts();
    }
    @GetMapping("/getbyid/{id}")
    public Optional<Product> getById(@PathVariable String id){
        return productService.getById(id);
    }
    @DeleteMapping("/deletebyid/{id}")
    public String deldeteById(@PathVariable String id){

       return productService.deldeteById(id);
    }

}