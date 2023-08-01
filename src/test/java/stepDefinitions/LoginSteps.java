package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.LoginPage;
import pages.ProductsPage;
import utils.DriverFactory;

import java.sql.Driver;

public class LoginSteps {
    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    ProductsPage productsPage = new ProductsPage(driver);

    @Given("Go To Login Page")
    public void goToLoginPage() {
        loginPage.goToLoginPage("https://www.saucedemo.com/");
    }

    @Then("Verify {string} error message")
    public void verifyErrorMessage(String errorMessage) {
        loginPage.verifyErrorMessage(errorMessage);
    }

    @When("Enter {string} in password field")
    public void enterInPasswordField(String password) {
        loginPage.enterPasswordInPasswordField(password);
    }

    @When("Enter {string} in username field")
    public void enterInUsernameField(String username) {
        loginPage.enterUsernameInUsernameField(username);
    }

    @When("Click Login Button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("Verify that you are on Products Page")
    public void verifyThatYouAreOnProductsPage() {
        productsPage.verifyThatYouAreOnProductsPage();
    }
}
