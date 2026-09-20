package com.example.great.great.controller;

import com.example.great.great.entity.Product;
import com.example.great.great.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
//        return List.of(new Product(1L, "tv", "50,000"));
        return productRepository.findAll();
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<?> searchProduct(@PathVariable Long id) {
        Optional<Product> product = productRepository.findById(id);
//        if (product.isPresent()) {
//            return ResponseEntity.ok(product.get());
//        }
//        return ResponseEntity.notFound().build();

        return productRepository.findById(id)
                                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());

    }

//  Get - getting the resource
//  Post - add new resource
//  Patch - update existing resource
//  Put - replace existing resource
//  Delete - Delete a resource
    @PatchMapping("/products")
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    @DeleteMapping("/products/{id   }")
    public void delete(Long id) {
        productRepository.delete(id);
    }

}
