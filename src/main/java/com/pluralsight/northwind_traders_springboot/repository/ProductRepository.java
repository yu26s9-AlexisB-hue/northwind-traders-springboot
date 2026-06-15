package com.pluralsight.northwind_traders_springboot.repository;

import com.pluralsight.northwind_traders_springboot.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface ProductRepository extends JpaRepository {
    List<Product> findByCategory(String category);
    List<Product> findByPrice(BigDecimal price);
    List<Product> findByName(String name);
}
