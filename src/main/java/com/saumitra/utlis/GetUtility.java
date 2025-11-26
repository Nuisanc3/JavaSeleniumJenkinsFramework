package com.saumitra.utlis;

import com.saumitra.base.CommonPageObject;
import org.openqa.selenium.By;

import java.util.Set;

public class GetUtility extends CommonPageObject {

    public static String getWindowHandle() {
        return driver.getWindowHandle();
    }

    public static Set<String> getWindowsHandles() {
        return driver.getWindowHandles();
    }

    public static String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public static String getAttribute(By locator, String attribute) {
        return driver.findElement(locator).getAttribute(attribute);
    }

    public static String getURL() {
        return driver.getCurrentUrl();
    }

}
