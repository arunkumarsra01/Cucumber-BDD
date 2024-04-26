Feature: Add to Cart functionality

  Scenario: Verify the product added to the shopping cart
    Given User is in the login page
    When User enters the  username as "adminuser@rediff.com" and password as "adminuser"
    And User clicks on the login button
    And User clicks on the books section
    And User add the selected product to the cart
    Then User should verify the confirmation message