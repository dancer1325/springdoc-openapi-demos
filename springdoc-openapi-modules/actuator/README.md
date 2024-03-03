# Spring Boot Actuator support
* [Spring Boot's module](https://github.com/spring-projects/spring-boot/tree/v3.2.3/spring-boot-project/spring-boot-actuator)
* 'springdoc-openapi-starter-webmvc-ui'
  * check '../springdoc-openapi-book-service-v3'
* `springdoc.show-actuator=true`
  * expose Spring Boot Actuator endpoints
    * via 
      * HTML
      * JSON
      * YAML
    * in a dedicated group
* `management.endpoints.web.exposure.include`
  * expose under Spring Boot Actuator's endpoint

# How to run it locally?
* Run it locally as mvn spring boot project

# Note
* Check all the possible combinations in 'application.properties'
  * Display Spring Boot Actuator's endpoints in the API Documentation via Spring Doc
  * Display API Documentation (OpenAPI & SwaggerUI) via Spring Boot Actuator
  * Do NOT run
  * Display in different ports API Documentation (OpenAPI & SwaggerUI) -- Spring Boot Actuator's endpoint
  * API Documentation SwaggerUI (just this one!!! NOT OpenAPI)  displayed in Spring Boot Actuator's endpoint