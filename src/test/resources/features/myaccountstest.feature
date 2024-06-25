Feature: My Account feature
  As a user i register an account and login to it.

  @author_JigarPatel @smoke @sanity @regression
  Scenario: Verify User Should Navigate To Register Page Successfully
    Given I am on homepage
    When Click on My Account Link
    And Call selectMyAccountOptions method and pass the parameter "Register"
    And Verify the Register text "Register Account"

  @author_JigarPatel @smoke @regression
  Scenario: Verify User Should Navigate To Login Page Successfully
    Given I am on homepage
    When Click on My Account Link
    And Call selectMyAccountOptions method and pass the parameter "Login"
    Then Verify the text on login page "Returning Customer"

  @author_JigarPatel @regression
  Scenario: Verify That User Register Account Successfully
    Given I am on homepage
    When Click on My Account Link
    And Call selectMyAccountOptions method and pass the parameter "Register"
    And Enter First Name "Test First Name"
    And Enter Last Name "Test Last Name"
    And Enter Email "prime1042@gmail.com"
    And Enter Telephone "0741258963"
    And Enter Password "Prime@123"
    And  Enter Password Confirm "Prime@123"
    And Select Subscribe Yes radio button
    And Click on Privacy Policy check box
    And Click on Continue button
    Then Verify the  message "Your Account Has Been Created!"
    And Click on Continue button from my account
    And Click on My Account Link
    And Call selectMyAccountOptions method and pass the parameter "Logout"
    Then Verify the account logout text "Account Logout"
    And Click on Continue button from my account

  @author_JigarPatel @regression
  Scenario: Verify That User Should Login And Logout Successfully
    Given I am on homepage
    When Click on My Account Link
    And Call selectMyAccountOptions method and pass the parameter "Login"
    And Enter Email address "prime1042@gmail.com"
    And Enter login Password "Prime@123"
    And Click on Login button
    And Verify my account text "My Account"
    And Click on My Account Link
    And Call selectMyAccountOptions method and pass the parameter "Logout"
    And Verify the account logout text "Account Logout"
    And Click on Continue button from my account