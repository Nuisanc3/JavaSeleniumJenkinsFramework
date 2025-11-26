package com.saumitra.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonPageObject {

    public static WebDriver driver;

    // Basically the idea here is to allow child classed to access this Driver and set the driver
    public void setDriver(WebDriver driver) {

        CommonPageObject.driver = driver;
    }

    // Now we also need to allow the Child classes to set their elements
    public static WebElement find(By locator) {

        return driver.findElement(locator);
    }

    // Idea is the same as above
    public static void set(By locator, String text) {
        find(locator).clear();
        find(locator).sendKeys(text); // Here we are allowing the child classes to set their locators properly
    }

    public static void click(By locator) {
        find(locator).click();
    }


    public static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
