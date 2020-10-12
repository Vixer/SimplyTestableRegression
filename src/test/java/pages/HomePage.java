package pages;

import org.openqa.selenium.WebDriver;
import pages.locators.HomeLocators;

public class HomePage {
    WebDriver driver;
    HomeLocators locators = new HomeLocators();

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
}
