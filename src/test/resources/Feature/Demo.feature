Feature: orangehrm page

  Scenario: successfulley login credinitials with valid
    Given : open browser
    And : user on login page
    When : user given username and password
    And : click on login page
    Then :user navigate to home page
