package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.ProductDto;
import com.example.entity.Product;
import com.example.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    public Product createProduct(ProductDto productDto) {
        Product product = new Product();
        product.setId(productDto.getId());
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        product.setDescription(productDto.getDescription());
        product.setQuantity(productDto.getQuantity());

        Product savedProduct = productRepository.save(product);
        return savedProduct;
    }

    public  List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    
    public Product updateProduct(int id, ProductDto updatedProduct) {
        Optional<Product> existingProduct = productRepository.findById(id);
        if (existingProduct.isPresent()) {
            Product product = existingProduct.get();
            product.setName(updatedProduct.getName());
            product.setPrice(updatedProduct.getPrice());
            product.setQuantity(updatedProduct.getQuantity());
            return productRepository.save(product);
        } else {
            throw new RuntimeException("Product not found");
        }
    }
      
    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
}