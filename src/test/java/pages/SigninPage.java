package pages;

import models.User;
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

    public void submitSigninInfo(User userId){
        DelayedElementFinder.findElement(driver, locators.getEmailFieldLocator())
                .sendKeys(userId.getEmailAddress());
        DelayedElementFinder.findElement(driver, locators.getPasswordFieldLocator())
                .sendKeys(userId.getPassword());
        DelayedElementFinder.findElement(driver, locators.getSubmitButtonLocator())
                .click();
    }

    public Boolean isResetPasswordButtonShown(){
        return DelayedElementFinder.findElements(driver,locators
                .getFailedLoginResetPasswordButtonLocator())
                .size() != 0;
    }

    public Boolean isSignUpButtonShown(){
        return DelayedElementFinder.findElements(driver,locators.getSignUpButtonLocator())
                .size() != 0;
    }

}
