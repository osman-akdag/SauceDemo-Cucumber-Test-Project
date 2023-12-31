package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementHelper {
    WebDriver driver;
    WebDriverWait wait;
    Actions action;

    public ElementHelper(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.action = new Actions(driver);
    }

    public WebElement presenceElement(By key){
        return wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }
    public WebElement findElement(By locator){
        return presenceElement(locator);
    }
    public void click(By locator){
        findElement(locator).click();
    }
    public void sendKey(By locator, String text){
        findElement(locator).sendKeys(text);
    }
    public boolean isVisible(By locator){
        return findElement(locator).isDisplayed();
    }

    public void go (String url){
        driver.get(url);
    }

}