package pages.locators;

import org.openqa.selenium.By;

public class CommonLocators {
    private By signinLinkLocator = By.xpath("//a[contains(@href,'signin')]");
    private By signOutButtonLocator = By.xpath("//button[contains(text(),'Sign out')]");

    public By getSigninLinkLocator(){
        return signOutButtonLocator;
    }

    public By getSignOutButtonLocator() {
        return signOutButtonLocator;
    }
}
