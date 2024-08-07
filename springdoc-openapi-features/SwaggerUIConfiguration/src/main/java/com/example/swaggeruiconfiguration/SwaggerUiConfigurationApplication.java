package com.example.swaggeruiconfiguration;

import java.util.Collections;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SwaggerUiConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerUiConfigurationApplication.class, args);
	}

	public class Book {
		private long id;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}
	}

	@GetMapping("/")
	public List<Book> findBooks() { return Collections.singletonList(new Book());}

	@GetMapping("/sayHello")
	public String sayHello() { return "Hello";}
}
