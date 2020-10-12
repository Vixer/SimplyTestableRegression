package pages;
import org.openqa.selenium.WebDriver;
import pages.locators.CommonLocators;

public class CommonPage {
    WebDriver driver;
    CommonLocators locators = new CommonLocators();

    public CommonPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSigninLink(){
        driver.findElement(locators.getSigninLinkLocator()).click();
    }

    public void clickSignOutButton(){
        driver.findElement(locators.getSignOutButtonLocator()).click();
    }

    public Boolean checkLogOutButtonShown(){
       return (driver.findElements(locators.getSignOutButtonLocator()).size() != 0);
    }


}
