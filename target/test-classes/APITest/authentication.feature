Feature: Authentication

  Scenario: As a user I want to register in order to have an account to login
    Given user is on Register endpoint
    When user send Register endpoint requests
    Then user success Register with status code response 200 OK

  Scenario: As a user I have succes login with valid data
    Given user is on Login endpoint
    When user  send requests Login endpoint
    Then user success login with status code response 200 OK

  Scenario: As a user I want to see my account information
    Given user get endpoint auth
    When user send request endpoint auth
    When user have endpoint auth to get user information
    And user use get method and token from login
    Then User succes to get user information with status code 200