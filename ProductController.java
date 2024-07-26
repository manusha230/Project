package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.ProductDto;
import com.example.entity.Product;
import com.example.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	private ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	@PostMapping
	public Product createProduct(@RequestBody ProductDto productDto) {
		return productService.createProduct(productDto);
	}

	@PutMapping("/{id}")
	public Product updateProduct(@PathVariable int id,@RequestBody ProductDto productDto) {
		return productService.updateProduct(id, productDto);
	}

	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable int id) {
		productService.deleteProduct(id);
	}
}
