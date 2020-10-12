package seleniumTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.CommonPage;
import pages.HomePage;
import pages.SigninPage;
import services.UserProvider;
import utils.Properties;

public abstract class AbstractBaseTest {
    WebDriver driver;
    UserProvider userProvider = new UserProvider();
    HomePage homePage;
    CommonPage commonPage;
    SigninPage signinPage;

    @BeforeClass
    public void setUp(){
        driver= Properties.getBROWSER();
        homePage = new HomePage(driver);
        commonPage = new CommonPage(driver);
        signinPage = new SigninPage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
