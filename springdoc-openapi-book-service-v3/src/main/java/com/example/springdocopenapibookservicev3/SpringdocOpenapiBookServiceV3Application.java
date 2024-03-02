package com.example.springdocopenapibookservicev3;

import com.example.springdocopenapibookservicev3.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@EnableFeignClients(clients = {BookRepository.class})
@SpringBootApplication
public class SpringdocOpenapiBookServiceV3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringdocOpenapiBookServiceV3Application.class, args);
    }

}
