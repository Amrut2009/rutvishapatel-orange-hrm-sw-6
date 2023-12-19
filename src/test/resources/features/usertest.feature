Feature: Login Test

  As a User I want to Login Successfully

  @sanity @regression
  Scenario: Verify Admin should add User Successfully
    Given I am on Homepage
    When I enter user name "Admin"
    And I enter password "admin123"
    And I click on Login Button
    And I click On Admin Tab
    And I Verify "System Users" Text
    And I click on "Add" Button
    And I verify "Add User" Text on that field
    And I select User Role "Admin"
    And I enter employee name "Lisa"
    And  I  enter Username "johnsmith1234567"
    And I Select status "Disable"
    And I  enter Password "John@1234" in password field
    And I enter Confirm Password  "John@1234"
    And I  click On "Save" Button on page
    Then I verify message "Successfully Saved"

  @smoke @regression
  Scenario:  Verify search The User which is Created
    Given I am on Homepage
    When I enter user name "Admin"
    And I enter password "admin123"
    And I click on Login Button
    And I click On Admin Tab
    And I Verify "System Users" Text
    And  I  enter Username "johnsmith1234567" in username field
    And I Select status "Disable"
    And I click On "Search" Button in search field
    Then I Verify User should be in Result List

 @regression
  Scenario: Verify That Admin Should Delete The User SuccessFully
    Given I am on Homepage
    When I enter user name "Admin"
    And I enter password "admin123"
    And I click on Login Button
    And I click On Admin Tab
    And I Verify "System Users" Text
    And  I  enter Username "johnsmith1234567" in username field
    And I Select status "Disable"
    And I click On "Search" Button in search field
    And  I Verify User should be in Result List
    And Click on Check box
    And Click on Delete Button in delete field
    And Popup will display
    And Click on Ok Button on Popup
    Then verify message "Successfully Deleted" user deleted


 @regression
  Scenario: Search The Deleted User And Verify The Message NoRecordFound
    Given I am on Homepage
    When I enter user name "Admin"
    And I enter password "admin123"
    And I click on Login Button
    And I click On Admin Tab
    And I Verify "System Users" Text
    And  I  enter Username "johnsmith1234567" in username field
    And I Select status "Disable"
    And I click On "Search" Button in search field
    Then verify message "No Records Found"
