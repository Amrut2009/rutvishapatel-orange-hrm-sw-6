import com.orangehrmlive.demo.Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class UserTestSteps {

    @Given("I am on Homepage")
    public void iAmOnHomepage() {

    } @When("I enter user name {string}")
    public void iEnterUserName(String Admin) {
        new LoginPage().enterUsername(Admin);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String admin123) {
        new LoginPage().enterPassword(admin123);
    }

    @And("I click on Login Button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @And("I click On Admin Tab")
    public void iClickOnAdminTab() {
        new HomePage().clickOnAdminTab();
    }

    @And("I Verify {string} Text")
    public void iVerifyText(String arg0) {
        String expectedText = "System Users";
        String actualText = new AdminPage().getSystemUserText();
        Assert.assertEquals(actualText, expectedText, "Error message found");
    }

    @And("I click on {string} Button")
    public void iClickOnButton(String arg0) {
        new LoginPage().clickOnLoginButton();
    }

    @And("I verify {string} Text on that field")
    public void iVerifyTextOnThatField(String arg0) {
        String expectedMessage = "Add User";
        String actualMessage = new AdminPage().getAddUserText();
        Assert.assertEquals(actualMessage, expectedMessage, "Error message found");
    }

    @And("I select User Role {string}")
    public void iSelectUserRole(String arg0) {
        new ViewSystemUsersPage().selectUserRoleFromDropDown();
    }

    @And("I enter employee name {string}")
    public void iEnterEmployeeName(String empName) {
        new AddUserPage().enterEmployeeName(empName);

    }

    @And("I  enter Username {string}")
    public void iEnterUsername(String UserName) {
        new AddUserPage().enterUsername(UserName);
    }

    @And("I Select status {string}")
    public void iSelectStatus(String arg0) {
        new AddUserPage().clickOnStatusSelect();
    }

    @And("I  enter Password {string} in password field")
    public void iEnterPasswordInPasswordField(String Password) {
        new AddUserPage().enterPassword(Password);
    }

    @And("I enter Confirm Password  {string}")
    public void iEnterConfirmPassword(String ConfirmPassword) {
        new AddUserPage().enterConfirmPassword(ConfirmPassword);
    }

    @And("I  click On {string} Button on page")
    public void iClickOnButtonOnPage(String arg0) {
        new AdminPage().clickOnAddButton();
    }

    @Then("I verify message {string}")
    public void iVerifyMessage(String arg0) {
        String expectedText = "System Users";
        String actualText = new AdminPage().getSystemUserText();
        Assert.assertEquals(actualText, expectedText, "Error message found");
    }

    @And("I  enter Username {string} in username field")
    public void iEnterUsernameInUsernameField(String UserName) {
        new LoginPage().enterUsername(UserName);
    }

    @And("I click On {string} Button in search field")
    public void iClickOnButtonInSearchField(String arg0) {
        new ViewSystemUsersPage().clickOnSearchButton();
    }


    @Then("I Verify User should be in Result List")
    public void iVerifyUserShouldBeInResultList() {
        String expectedList = "johnsmith1234567";
        String actualList = new ViewSystemUsersPage().getUserShouldBeInListText();
        Assert.assertEquals(actualList, expectedList, "Error message displayed");
    }

    @And("Click on Check box")
    public void clickOnCheckBox() {
        new ViewSystemUsersPage().clickOnCheckBox();
    }

    @And("Click on Delete Button in delete field")
    public void clickOnDeleteButtonInDeleteField() {
        new ViewSystemUsersPage().clickOnDeleteButton();
    }

    @And("Popup will display")
    public void popupWillDisplay() {

    }

    @And("Click on Ok Button on Popup")
    public void clickOnOkButtonOnPopup() {
        new ViewSystemUsersPage().clickOnYesDeleteButton();
    }

    @Then("verify message {string} user deleted")
    public void verifyMessageUserDeleted(String arg0) {
        String expectedText = "Successfully Deleted";
        String actualText = new ViewSystemUsersPage().getSuccessfullyDeletedText();
        Assert.assertEquals(actualText, expectedText, "Error message displayed");

    }

    @Then("verify message {string}")
    public void verifyMessage(String arg0) {
        String expectedText = "No Records Found";
        String actualText = new ViewSystemUsersPage().getNoRecordFoundText();
        Assert.assertEquals(actualText, expectedText, "Error message displayed");
    }
}


