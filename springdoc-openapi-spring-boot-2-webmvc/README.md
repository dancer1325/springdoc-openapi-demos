# springdoc-openapi demo with spring-boot-2 web-mvc

## Pre-requisites
* JDK 8+
* maven 3
* docker CLI

## How to run?
* via local service in a port
  * `mvn clean package`
    * create an `executable jar`
  * `java -jar executableName.jar`
* via Docker container
  * `mvn clean spring-boot:build-image`
    * create a non-native OCI docker image
  * `docker run --rm -p 8080:8081 springdoc-openapi-spring-boot-2-webmvc:3.1.6-SNAPSHOT`

## Notes
* OpenAPI specification -- 'petstore.yaml'
  * once you compile -> exist in the classpath --check in 'target/classes' --
  * ⚠️if you delete it or move to another folder and compile again -> ⚠
    * NO existing anymore in th️e classpath &
    * ⭐ swaggerUI still works ⭐ --> springDoc trust in SpringConfigurations
