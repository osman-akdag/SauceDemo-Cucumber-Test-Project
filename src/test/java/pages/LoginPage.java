package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.ElementHelper;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    ElementHelper elementHelper;

    //Locators
    private final By usernameFieldLocator = By.id("user-name");
    private final By passwordFieldLocator = By.id("password");
    private final By loginButtonLocator = By.id("login-button");
    private final By errorMessageLocator = By.cssSelector("h3");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.elementHelper = new ElementHelper(driver);
    }

    public void goToLoginPage(String url) {
        elementHelper.go(url);
    }

    public void clickLoginButton() {
        elementHelper.click(loginButtonLocator);
    }

    public void verifyErrorMessage(String errorMessage) {
        String actualMessage = elementHelper.findElement(errorMessageLocator).getText();
        Assert.assertEquals(actualMessage,errorMessage);
    }

    public void enterPasswordInPasswordField(String password) {
        elementHelper.sendKey(passwordFieldLocator,password);
    }

    public void enterUsernameInUsernameField(String username) {
        elementHelper.sendKey(usernameFieldLocator,username);
    }
}
