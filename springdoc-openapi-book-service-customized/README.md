# Getting Started
* API documentation paths can be customized
  * `springdoc.swagger-ui.path=/CustomPath.html` -- HTML format  related to Swagger UI -- →
    * http://server:port/context-path/CustomPath.html
      * redirect to the default one!!!
    * http://server:port/context-path/swagger-ui/index.html
      * still valid!!!
  * `springdoc.api-docs.path=/CustomPath` -- JSON /YAML format -- related to OpenAPI -- -->
    * JSON
      * http://server:port/context-path/CustomPath        
      * http://server:port/context-path/v3/api-docs
        * NOT valid!!
    * YAML
      * http://server:port/context-path/CustomPath.yaml
      * http://server:port/context-path/v3/api-docs.yaml
        * NOT valid!!

# How to run it locally?
* Run it locally as mvn spring boot project
* Open in your browser
  * HTML 
    * http://localhost:8080/customized.html
      * check that it redirects to http://localhost:8080/swagger-ui/index.html !!
    * http://localhost:8080/swagger-ui/index.html
  * JSON 
    * http://localhost:8080/customized
    * http://localhost:8080/v3/api-docs  -- NOT valid
  * YAML
    * http://localhost:8080/customized.yaml
    * http://localhost:8080/v3/api-docs.yaml  -- NOT valid

