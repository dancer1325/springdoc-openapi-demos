# Relevant Articles:

* [Outdated] [Documenting a Spring REST API Using OpenAPI 3.0](https://www.baeldung.com/spring-rest-openapi-documentation)
  * Not valid anymore

# How to run it locally?
* Run it locally as mvn spring boot project
* Open in your browser
  * http://localhost:8080/swagger-ui/index.html

# Notes
* [springdoc-openapi-maven-plugin](https://github.com/springdoc/springdoc-openapi-maven-plugin)
  * Required to work in conjunction with [spring-boot-maven plugin](https://github.com/spring-projects/spring-boot/tree/main/spring-boot-project/spring-boot-tools/spring-boot-maven-plugin)
* [org.springdoc:springdoc-openapi-ui](https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-ui)
  * It comes with `io.swagger.core.v3`
    * `mvn dependency:tree -Dincludes=io.swagger.core.v3:swagger-models`
* `springdoc.swagger-ui.use-root-path`
  * Property to enable the swagger-ui at the root path
  * [Link](https://springdoc.org/#swagger-ui-properties)