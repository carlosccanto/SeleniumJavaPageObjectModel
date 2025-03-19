@registerUser

  Feature: Register User

    Scenario: TC 1 Register User

      Given I Navigate to automationexercise page
      Given I Click on the login button
      When I Enter name "carlos"
      And  I Enter email address "carlos9@rcpo.com"
      And I Click Signup button
      And I Click Title Mr
      And I Fill Password "carlos123"
      And Select day of birth
      And Select month of birth
      And Select year of birth
      And I Fill First name field "Carlos"
      And I Fill Last name field "Ccanto"
      And I Fill Address field "Falsa 123"
      And I Select country
      And I Fill State field "Cordoba"
      And I Fill City field "Cordoba"
      And I Fill Zipcode field "5000"
      And I Fill Mobile Number field "3516212341"
      And I Click Create Account button
      Then the text "Continue" should be visible on the result page on the Search Engine page


