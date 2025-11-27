package com.saumitra.base;

import com.saumitra.utlis.GetUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CommonPageObject {

    // Make it protected, not static - each test should have its own driver
    protected WebDriver driver;
    protected GetUtility utils;

    // Constructor to set driver
    public CommonPageObject(WebDriver driver) {
        this.driver = driver;
        this.utils = new GetUtility(driver);
        PageFactory.initElements(driver, this);
    }

    // Instance methods (not static)
    public WebElement find(By locator) {
        return driver.findElement(locator);
    }

    public void set(By locator, String text) {
        find(locator).clear();
        find(locator).sendKeys(text);
    }

    public void click(By locator) {
        find(locator).click();
    }

    public void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}