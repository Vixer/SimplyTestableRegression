package pages.locators;

import org.openqa.selenium.By;

public class SigninLocators {
    private By emailFieldLocator = By.xpath("//input[@id='email']");
    private By passwordFieldLocator = By.xpath("//input[@id='password']");
    private By submitButtonLocator = By.xpath("//button[@id='submit']");

    public By getEmailFieldLocator(){
        return emailFieldLocator;
    }

    public By getPasswordFieldLocator() {
        return passwordFieldLocator;
    }

    public By getSubmitButtonLocator() {
        return submitButtonLocator;
    }
}
