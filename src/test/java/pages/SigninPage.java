package pages;

import org.openqa.selenium.WebDriver;
import pages.locators.SigninLocators;
import utils.DelayedElementFinder;

public class SigninPage {
    WebDriver driver;
    SigninLocators locators = new SigninLocators();
    private String expectedPageTitle = "Sign in";

    public SigninPage(WebDriver driver){
        this.driver = driver;
    }

    public String getPageTitle(){
        return driver.getTitle();
    }

    public Boolean compareExpectedToActualPageTitle(){
        return getPageTitle().contains(expectedPageTitle);
    }

    public void submitSigninInfo(String email, String password){
        DelayedElementFinder.findElement(driver, locators.getEmailFieldLocator()).sendKeys(email);
        driver.findElement(locators.getPasswordFieldLocator()).sendKeys(password);
        driver.findElement(locators.getSubmitButtonLocator()).click();
    }

}
