# springdoc-openapi demo with spring-boot-2 hateoas

## Building application

### Pre-requisites
- JDK 8+
- maven 3
- docker CLI

### Option 1: Building Executable JAR
* `mvn clean package`
  * create an `executable jar`
  
### Option 2: Building a non-native OCI Images
* `mvn clean spring-boot:build-image`
  * create a non-native OCI docker image

## How to run it locally? Running the native application
### Option 1: Via non containerized
* `mvn spring-boot:run`
### Option 2: Via non-native OCI image
* `docker pull springdocdemos/springdoc-openapi-hateoas-service:latest`
* `docker run --rm -p 8080:8080 springdocdemos/springdoc-openapi-hateoas-service:latest`

## Notes
* Open in your browser
  * http://localhost:8080/swagger-ui/index.html
    * HTML                  
  * http://localhost:8080/v3/api-docs
    * JSON                  
  * http://localhost:8080/v3/api-docs.yaml
    * YAML                  