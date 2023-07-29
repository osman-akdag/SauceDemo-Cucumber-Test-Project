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
    WebDriverWait wait;

    //Locators
    private final By loginButtonLocator = By.id("login-button");
    private final By errorMessageLocator = By.cssSelector("h3");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);
    }

    public void goToLoginPage(String url) {
        elementHelper.go(url);
    }

    public void clickTheLoginButton() {
        elementHelper.click(loginButtonLocator);
    }

    public void verifyErrorMessage(String errorMessage) {
        String actualMessage = elementHelper.findElement(errorMessageLocator).getText();
        System.out.println("----"+actualMessage+"-----");
        Assert.assertEquals(actualMessage,errorMessage);
    }
}
