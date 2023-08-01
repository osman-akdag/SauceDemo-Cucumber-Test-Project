package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.ElementHelper;


public class ProductsPage {
    WebDriver driver;
    ElementHelper elementHelper;

    // Locators

    private final By logoLocator = By.cssSelector(".app_logo");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        this.elementHelper = new ElementHelper(driver);
    }

    public void verifyThatYouAreOnProductsPage() {
        Assert.assertTrue(elementHelper.isVisible(logoLocator));
    }
}
