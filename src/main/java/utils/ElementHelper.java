package utils;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.locators.LoginPageLocators;
import utils.SeleniumDriver;

public class ElementHelper {



    public static boolean isElementPresent(WebElement webElement) {
        try {
            boolean isPresent = webElement.isDisplayed();
            return isPresent;
        } catch (NoSuchElementException e) {
            return false;
        }
        
    }

    public static void textCheck(String actual, String expected)
    {
        Assert.assertEquals(actual, expected);
    }

    public static void waitForElementToBeVisible(WebElement element)
    {
        SeleniumDriver.waitDriver.until(ExpectedConditions.visibilityOf(element));
    }
}
