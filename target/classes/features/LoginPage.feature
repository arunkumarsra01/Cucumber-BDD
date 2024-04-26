Feature: Login Page

  Scenario: Verify the login page functionality
    Given User is in login page
    When User enters username as "adminuser@rediff.com" and password as "adminuser"
    And User clicks on login button
    Then User should able to see the product details

  Scenario Outline: Verify the login functionality for invalid crdentials
    Given User is in login page
    When User enters the username as "<userName>" and password as "<Password>"
    And User clicks on login button
    Then User should see the error message

    Examples: 
      | userName         | Password    |
      | test@gmail.com   | testgmail   |
      | test@hotmail.com | testhotmail |
      | test@yahoo.com   | testyahoo   |
      | test@rediff.com  | testrediff  |
