package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DelayedElementFinder {
    public static WebElement findElement(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement element;

        try {
            element = driver.findElement(locator);
        } catch (NoSuchElementException e) {
            wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==\"complete\";"));
            element = driver.findElement(locator);
        }
        catch (TimeoutException e){
            System.out.println("TIMEOUT"+e.toString());
            throw (e);
        }
        catch (Exception e){
            System.out.println("TIMEOUT"+e.toString());
            throw (e);
        }
        return element;
    }
}