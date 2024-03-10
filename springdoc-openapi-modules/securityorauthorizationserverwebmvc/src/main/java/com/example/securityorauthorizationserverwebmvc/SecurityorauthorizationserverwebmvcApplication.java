package com.example.securityorauthorizationserverwebmvc;

import java.util.Collections;
import java.util.List;

import jakarta.annotation.security.RolesAllowed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SecurityorauthorizationserverwebmvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityorauthorizationserverwebmvcApplication.class, args);
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

	@RolesAllowed("USER")
	@GetMapping("/")
	public List<Book> findBooks() { return Collections.singletonList(new Book());}


	@GetMapping("/another")
	public List<Book> findOtherBooks() { return Collections.singletonList(new Book());}

}
