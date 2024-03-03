# Kotlin support
* ‘s modules ==  Java based’s modules
* requires 'com.fasterxml.jackson.module:jackson-module-kotlin'
  * is added by default using Spring Initialzr!!

# How to run it locally?
* Run it locally as mvn spring boot project
* Open in your browser
  * http://localhost:8080/swagger-ui/index.html
    * API documentation in HTML 
  * http://localhost:8080/v3/api-docs
    * JSON 
  * http://localhost:8080/v3/api-docs.yaml
    * YAML

# Note
* Problems:
  * Problem1: 'springdoc-openapi-starter-common.kotlin_module' Module was compiled with an incompatible version of Kotlin. The binary version of its metadata is 1.9.0, expected version is 1.7.1.
    * Attempt1: `kotli.version : 1.7.10`
    * Solution: `springdoc-openapi-starter-webmvc-ui: 2.2.0`
