package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

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
            System.out.println(e.toString());
            throw (e);
        }
        return element;
    }

    public static List<WebElement> findElements(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        List<WebElement> elements;

        try {
            elements = driver.findElements(locator);
        } catch (NoSuchElementException e) {
            wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==\"complete\";"));
            elements = driver.findElements(locator);
        }
        catch (TimeoutException e){
            System.out.println("TIMEOUT"+e.toString());
            throw (e);
        }
        catch (Exception e){
            System.out.println(e.toString());
            throw (e);
        }
        return elements;
    }
}