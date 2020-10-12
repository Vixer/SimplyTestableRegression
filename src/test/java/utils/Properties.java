package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Properties {
    private static final String URL = System.getProperty("url", "https://simplytestable.com/");
    private static final String BROWSER = System.getProperty("browser", "chrome");

    public static String getURL() {
        return URL;
    }

    public static WebDriver getBROWSER() {
        System.getProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        System.getProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
        WebDriver driver;

        if (BROWSER.equals("chrome")) {
            driver = new ChromeDriver();
        }
        else if(BROWSER.equals("firefox")){
            driver = new FirefoxDriver();
        }
        else if(BROWSER.equals("headless")){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            driver = new ChromeDriver(options);
        }
        else {
            driver = new ChromeDriver();
        }
        return driver;
    }
}