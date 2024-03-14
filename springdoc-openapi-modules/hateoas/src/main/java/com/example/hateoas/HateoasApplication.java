package com.example.hateoas;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;


@RestController
@SpringBootApplication
public class HateoasApplication {

	public static void main(String[] args) {
		SpringApplication.run(HateoasApplication.class, args);
	}

	private static final String TEMPLATE = "Hello, %s!";

	@RequestMapping("/greeting")
	public HttpEntity<Greeting> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {

		Greeting greeting = new Greeting(String.format(TEMPLATE, name));
		greeting.add(linkTo(methodOn(HateoasApplication.class).greeting(name)).withSelfRel());

		return new ResponseEntity<>(greeting, HttpStatus.OK);
	}

	public class Greeting extends RepresentationModel<Greeting> {

		private final String content;

		@JsonCreator
		public Greeting(@JsonProperty("content") String content) {
			this.content = content;
		}

		public String getContent() {
			return content;
		}
	}

}
