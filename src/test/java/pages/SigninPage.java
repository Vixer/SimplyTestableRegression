package pages;

import org.openqa.selenium.WebDriver;
import pages.locators.SigninLocators;

public class SigninPage {
    WebDriver driver;
    SigninLocators locators = new SigninLocators();

    public SigninPage(WebDriver driver){
        this.driver = driver;
    }

    public void submitSigninInfo(String email, String password){
        driver.findElement(locators.getEmailFieldLocator()).sendKeys(email);
        driver.findElement(locators.getPasswordFieldLocator()).sendKeys(password);
        driver.findElement(locators.getSubmitButtonLocator()).click();
    }

}
