import com.orangehrmlive.demo.Pages.DashboardPage;
import com.orangehrmlive.demo.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginTestSteps {
    @Given("I am on Homepage")
    public void iAmOnHomepage() {

    }

    @When("I enter user name {string}")
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

    @Then("Verify {string} Message on page")
    public void verifyMessageOnPage(String arg0) {
        String expectedMessage = "Dashboard";
        String actualMessage = new DashboardPage().getDashboardText();
        Assert.assertEquals(actualMessage, expectedMessage, "Error message found");
    }


    @Then("Verify Logo is Displayed")
    public void verifyLogoIsDisplayed() {
        new LoginPage().verifyLogoIsDisplayed();
    }

    @And("I Click on User Profile logo")
    public void iClickOnUserProfileLogo() {
        new LoginPage().clickOnUserProfileLogo();
    }

    @And("I Mouse hover on {string} and click")
    public void iMouseHoverOnAndClick(String arg0) {
        new LoginPage().mouseHoverAndClickOnLogout();
    }

    @Then("Verify the text {string} is displayed")
    public void verifyTheTextIsDisplayed(String arg0) {
        String expectedMessage = "Login";
        String actualMessage = new LoginPage().getLoginText();
        System.out.println(actualMessage);
        Assert.assertEquals(actualMessage, expectedMessage, "Error message displayed");
    }
}
