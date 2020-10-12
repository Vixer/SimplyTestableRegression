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
        // Go to sign up page and check you're on the correct page
        commonPage.clickSigninLink();
        Assert.assertTrue(signinPage.compareExpectedToActualPageTitle());
    }

    @Test
    public void validLogin() {
        // Check a valid user can log in
        //1 Action. Enter valid details and submit
        signinPage.submitSigninInfo("passionfruit49@hotmail.com", "TestPass");
        //2 Assert. Check user logged in by checking that the log out button is shown
        Assert.assertTrue(commonPage.checkLogOutButtonShown());
    }

    @Test
    public void unsuccessfulLoginIncorrectPassword() {
        // Registered User is not logged in if their password is incorrect, and a link to reset password is shown
        //1 Action. Enter valid details and submit
        signinPage.submitSigninInfo("passionfruit49@hotmail.com", "Smoo");
        //2 Assert. Check not logged in by checking log out button not shown
        Assert.assertFalse(commonPage.checkLogOutButtonShown());
        //3 Assert. Check alert box contains link to reset password
        Assert.assertTrue(signinPage.isResetPasswordButtonShown());


    }

    @Test
    public void unsuccessfulLoginNotRegistered() {
        // Where an email address is not registered, user is not logged in but shown signup option
        // 1 Action. Enter and submit unregistered details
        signinPage.submitSigninInfo("pass@hotmail.com", "Smoo");
        // 2 Assert. Check user not logged in
        Assert.assertFalse(commonPage.checkLogOutButtonShown());
        // 3 Assert. A button allows user to go to signup page
        Assert.assertTrue(signinPage.isSignUpButtonShown());
    }
}
