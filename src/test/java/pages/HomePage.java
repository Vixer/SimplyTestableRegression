package pages;

import org.openqa.selenium.WebDriver;
import pages.locators.HomeLocators;
import utils.Properties;

public class HomePage {
    WebDriver driver;
    HomeLocators locators = new HomeLocators();
    private String expectedUrl = Properties.getURL();

    public HomePage(WebDriver driver){
        this.driver = driver;
    }


    public Boolean compareActualToExpectedUrl(){
        return driver.getCurrentUrl().equals(expectedUrl);
    }
}
