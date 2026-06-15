package com.pluralsight.northwind_traders_springboot.service;

import com.pluralsight.northwind_traders_springboot.model.Product;
import com.pluralsight.northwind_traders_springboot.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long productId){
        return productRepository.findById(productId);
    }

    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    public void deleteProduct(Long productId){
        productRepository.deleteById(productId);
    }

    public List<Product> findByCategory(String category){
        return productRepository.findByCategory(category);
    }

    public List<Product> findByPrice(BigDecimal price){
        return productRepository.findByPrice(price);
    }

    public List<Product> findByName(String name){
        return productRepository.findByName(name);
    }
}
