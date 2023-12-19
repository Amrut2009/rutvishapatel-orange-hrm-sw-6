Feature: Login Test

  As a User I want to Login Successfully

  @sanity @regression
  Scenario: Verify User Should Login SuccessFully
    Given I am on Homepage
    When I enter user name "Admin"
    And I enter password "admin123"
    And I click on Login Button
    Then Verify "Dashboard" Message on page

@smoke @regression
  Scenario: Verify That The Logo Display On HomePage
    Given I am on Homepage
    When I enter user name "Admin"
    And I enter password "admin123"
    And I click on Login Button
    Then Verify Logo is Displayed
#
 @regression
  Scenario: verifyUserShouldLogOutSuccessFully()
    Given I am on Homepage
    When I enter user name "Admin"
    And I enter password "admin123"
    And I click on Login Button
    And I Click on User Profile logo
    And I Mouse hover on "Logout" and click
    Then Verify the text "Login Panel" is displayed