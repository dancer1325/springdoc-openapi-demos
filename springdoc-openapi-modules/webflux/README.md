# spring-webflux
* Spring Boot's dependency
* 'springdoc-openapi-starter-webflux-api'
  * springdoc dependency built on top of 'spring-webflux'
  * exposes API documentation in
    * JSON
    * YAML

# How to run it locally?
* Run it locally as mvn spring boot project
* Open in your browser
  * http://localhost:8080/swagger-ui/index.html
    * check that nothing found since 'swagger-ui' dependency is NOT used
  * http://localhost:8080/webfluxcustomized
    * JSON
      * Problems:
        * Problem1: Not accessible
          * Attempt1: Use 'spring-webflux' without the starter
          * Solution: TODO:
  * http://localhost:8080/webfluxcustomized.yaml
    * YAML
  