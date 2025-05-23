package org.example.adminka.controllers;

import org.example.adminka.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping
    public List<Product> getProducts() {
        Product product = new Product();
        product.setId(1);
        product.setTitle("Phone");
        return List.of(product);
    }
}