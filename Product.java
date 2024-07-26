package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String name;
	private String description;
	private double price;
	private int quantity;

	@Override
	public String toString() {

		return "Employee [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", quantity=" + quantity + "]";

	}

// Getters and setters of 
// the properties 
	public Integer getId() {

		return id;
	}

	public void setId(Integer id) {

		this.id = id;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public String getDescription() {

		return description;
	}

	public void setDescription(String description) {

		this.description = description;
	}

	public Double getPrice() {

		return price;
	}

	public void setPrice(double price) {

		this.price = price;
	}

	public Integer getQuantity() {

		return quantity;
	}

	public void setQuantity(Integer quantity) {

		this.quantity = quantity;
	}
}
