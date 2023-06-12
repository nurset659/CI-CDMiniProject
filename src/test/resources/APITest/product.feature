Feature: Product

  @GetAllProduct+1
  Scenario: Get all product
    Given user is on product list page endpoint
    When user create requests product list endpoint
    Then user get a list of products
    And user succes to get list of product with response code 200 OK

  @CreatenewProduct+1
  Scenario: Create New Product
    Given user on the product POST page endpoint
    When user create request with POST method on endpoint
    Then the system responds with the status code 200 OK
    And  User succes to create new product

  @GetProductByID+1
  Scenario: Get all product by ID
    Given user is on product list by ID endpoint
    When user create requests product list by ID endpoint
    Then system responds with the status code 200 OK
    And user succes to get data product byID

  @DelProduct+1
  Scenario: Delete Product
    Given user delete post data with valid ID
    When user create request with DELETE method
    Then Response system 200 ok
    And Succes deleted id 14771

  @Rating+1
  Scenario: Assign a product rating
    Given user on the assign rating Endpoint
    When user create request with post method on selected product
    Then user give rating to product
    And User succes to give product rating

  @ProductRating
  Scenario: Get Product Ratings
    Given user on the product ratings endpoint
    When user create requests on product ratings endpoint
    Then user get list of products ratings
    And user succes to get product ratings