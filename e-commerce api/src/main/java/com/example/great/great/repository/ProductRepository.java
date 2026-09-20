package com.example.great.great.repository;

import com.example.great.great.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    void delete(Long id);

    Optional<Product> findByName(String name);

//    @Query("Select * from Product where name = ?1")
//    Product some CustomQuery(String name, String price);
}
