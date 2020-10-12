package seleniumTests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Properties;

public class LoginTests extends AbstractBaseTest {

    @BeforeMethod
    public void goToHomePage() {
        // Go to home URL, check we are on correct page, ensure we are logged out
        driver.get(Properties.getURL());
        Assert.assertTrue(homePage.compareActualToExpectedUrl());
        if (commonPage.checkLogOutButtonShown()) {
            commonPage.clickSignOutButton();
        }
    }

    @Test
    public void validLogin() {
        // Check a valid user can log in
        // 1. Click signin - Check on signin page
        commonPage.clickSigninLink();
        Assert.assertTrue(signinPage.compareExpectedToActualPageTitle());
        //2. Enter valid details and submit - check logged in by checking log out button shown
        signinPage.submitSigninInfo("passionfruit49@hotmail.com", "TestPass");
        Assert.assertTrue(commonPage.checkLogOutButtonShown());
    }

}
