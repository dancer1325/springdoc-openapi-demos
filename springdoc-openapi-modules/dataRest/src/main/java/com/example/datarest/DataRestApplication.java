package com.example.datarest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@SpringBootApplication
public class DataRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataRestApplication.class, args);
	}

	@Entity
	public class Product {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String name;
		private double price;

		// Getters and setters
	}

	public interface ProductRepository extends JpaRepository<Product, Long> {
	}

	@RepositoryRestResource
	public interface ProductRepositoryRest extends JpaRepository<Product, Long> {
	}

}
