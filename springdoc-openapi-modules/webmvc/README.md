# spring-webmvc
* Spring Boot's dependency
* 'springdoc-openapi-starter-webmvc-api'
  * springdoc dependency built on top of 'spring-webmvc'
  * exposes API documentation in
    * JSON
    * YAML

# How to run it locally?
* Run it locally as mvn spring boot project
* Open in your browser
  * http://localhost:8080/swagger-ui/index.html
    * check that nothing found since 'swagger-ui' dependency is NOT used
  * http://localhost:8080/webmvccustomized
    * JSON 
  * http://localhost:8080/webmvccustomized.yaml
    * YAML

# Note
* 'spring-boot-starter-web' == 'spring-webmvc' + 'spring-boot-starter-tomcat'
  * if you use just 'spring-webmvc' -> You do NOT have a web server for hosting the java application