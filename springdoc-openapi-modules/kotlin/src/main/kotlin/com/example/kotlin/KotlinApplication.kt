package com.example.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Collections

// If you try to define all in 1! class ->   NO endpoint would be defined with this approach
/*@RestController
@SpringBootApplication
class KotlinApplication

fun main(args: Array<String>) {
    runApplication<KotlinApplication>(*args)
}

class Book(val id: Long = 2)

@GetMapping("/")
fun findBooks(): List<Book> {
    return Collections.singletonList(Book())
}*/

@SpringBootApplication
class KotlinApplication

fun main(args: Array<String>) {
    runApplication<KotlinApplication>(*args)
}

class Book(val id: Long = 2)

@RestController
class HelloController {
    @GetMapping("/")
    fun findBooks(): List<Book> {
        return Collections.singletonList(Book())
    }
}
