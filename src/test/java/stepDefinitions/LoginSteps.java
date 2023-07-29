package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.LoginPage;
import utils.DriverFactory;

import java.sql.Driver;

public class LoginSteps {
    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    @Given("Go To Login Page")
    public void goToLoginPage() {
        loginPage.goToLoginPage("https://www.saucedemo.com/");
    }

    @When("Click the Login Button")
    public void clickTheLoginButton() {
        loginPage.clickTheLoginButton();
    }

    @Then("Verify {string} error message")
    public void verifyErrorMessage(String errorMessage) {
        loginPage.verifyErrorMessage(errorMessage);
    }
}
