package pages;
import org.openqa.selenium.WebDriver;
import pages.locators.CommonLocators;
import utils.DelayedElementFinder;

public class CommonPage {
    WebDriver driver;
    CommonLocators locators = new CommonLocators();

    public CommonPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSigninLink(){
        DelayedElementFinder.findElement(driver, locators.getSigninLinkLocator()).click();
    }

    public void clickSignOutButton(){
        DelayedElementFinder.findElement(driver, locators.getSignOutButtonLocator()).click();
    }

    public Boolean checkLogOutButtonShown() {
        return (DelayedElementFinder.findElements(driver, locators.getSignOutButtonLocator()).size() != 0);
    }
}
