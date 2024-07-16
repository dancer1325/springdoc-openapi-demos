# Goal
* `springdoc.swagger-ui.OffitialSwaggerUIProperties`
  * [OffitialSwaggerUIProperties](https://swagger.io/docs/open-source-tools/swagger-ui/usage/configuration/)
* Work even with the "DefaultSecurityFilterChain"

## How to run it locally?
* Run it locally as mvn spring boot project
* Open in your browser
  * http://localhost:8080/swagger-ui/index.html
    * at first time -> you are redirected to "http://localhost:8080/login"
      * fill in with user:passWordPrintOutByConsole
    * HTML
    * Check that operationIds are displayed 'findBooks'
  * http://localhost:8080/v3/api-docs
    * JSON 
    * Check that operationIds are returned 'findBooks'
  * http://localhost:8080/v3/api-docs.yaml
    * YAML
    * Check that operationIds are returned 'findBooks'
