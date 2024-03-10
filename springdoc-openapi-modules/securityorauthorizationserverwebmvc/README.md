# spring-security or spring-authorization-server
* allows
  * ignoring `@AuthenticationPrincipal` of Spring Security
    * TODO: 
  * exposing Oauth2 endpoints of Spring Authorization Server
    * TODO:
* Spring Security + Spring Authorization Server & you want OpenAPI + SwaggerUI -> `springdoc-openapi-starter-webmvc-ui`
  * just related OpenAPI & SwaggerUI must be skipped of authorizations to display properly the API Documentation
  * ALL endpoints with `RolesAllowed` or not are displayed!!


# How to run it locally?
* Run it locally as mvn spring boot project
* Open in your browser
  * http://localhost:8080/swagger-ui/index.html
    * if you do NOT skipp to be secured -> you are redirected to '/login page
  * http://localhost:8080/v3/api-docs
    * JSON 
    * if you do NOT skipp to be secured -> you are redirected to '/login page
  * http://localhost:8080/v3/api-docs.yaml
    * YAML
    * if you do NOT skipp to be secured -> you are redirected to '/login page

# Note
* Spring Security
  * -> you need to create 'WebSecurityConfig' -- Check [here](https://github.com/dancer1325/spring-guides-spring-security?tab=readme-ov-file#complete)
  * REST endpoints work
    * Solution: TODO: