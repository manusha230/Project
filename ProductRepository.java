package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    // DataSource dataSource; 
    //Connection connection;
    // PreparedStatement preparedStatement

    //save(product); INSERT INTO products (id, name, description,  price  quantity) VALUES (1, "iPhone Min", "Smart Phone", 75000.00 , 1);
    //update(id, product) UPDATE
    //readAll(); SELECT


}
