@SanityTest
Feature: Fidelis care LogIn

  Scenario: User able to register
    Given user is on fidelis care homepage
    When user click on login button
    And click on member online portal
    And click on register
    And click on register myself
    And enter member id
    And enter firstname
    And enter lastname
    And enter dob
    And enter ssn
    Then displays valid title
