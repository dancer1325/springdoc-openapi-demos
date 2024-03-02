# Introduction
* API documentation
  * supports
    * GraalVM native images

# How to run it locally?
* `mvn -Pnative spring-boot:build-image`
  * build the image
  * `docker images springdoc-openapi-book-service-graalvm` to check that your image has been created
* `docker run --rm -p 8080:8080 springdoc-openapi-book-service-graalvm:0.0.1-SNAPSHOT`
  * run locally
* Open in your browser
  * http://localhost:8080/swagger-ui/index.html