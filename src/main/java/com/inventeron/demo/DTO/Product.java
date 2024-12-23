package com.inventeron.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("Product")
public class Product {

    @Id
    private String productId;
    private String productName;
    private int productPrice;
    private String description;
    private String validity;
    private String quality;
    private int rating;
    private String seller;
    private String productType;

}
