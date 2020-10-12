package pages.locators;

import org.openqa.selenium.By;
import utils.DelayedElementFinder;

public class SigninLocators {
    private By emailFieldLocator = By.xpath("//input[@id='email']");
    private By passwordFieldLocator = By.xpath("//input[@id='password']");
    private By submitButtonLocator = By.xpath("//button[@id='submit']");
    private By failedLoginResetPasswordButtonLocator = By.xpath("//div[contains(@class,'alert')]//a[contains(@href,'reset-password')]");
    private By signUpButtonLocator = By.xpath("//div[contains(@class,'alert')]//button[contains(.,'sign me up')]");

    public By getEmailFieldLocator(){
        return emailFieldLocator;
    }

    public By getPasswordFieldLocator() {
        return passwordFieldLocator;
    }

    public By getSubmitButtonLocator() {
        return submitButtonLocator;
    }

    public By getSignUpButtonLocator(){
        return signUpButtonLocator;
    }

    public By getFailedLoginResetPasswordButtonLocator() {
        return failedLoginResetPasswordButtonLocator;
    }

}
