package com.saumitra.utlis;

import org.openqa.selenium.WebDriver;

public class SetDriverUtility {

    private static WebDriver driver;

    // Set the driver instance
    public static void setDriver(WebDriver driverInstance) {
        if (driverInstance == null) {
            throw new IllegalArgumentException("Driver instance cannot be null");
        }
        driver = driverInstance;
    }

    // Get the driver instance
    public static WebDriver getDriver() {
        if (driver == null) {
            throw new IllegalStateException("Driver not initialized. Call setDriver() first.");
        }
        return driver;
    }

    // Optional: Clear driver after test completion
    public static void removeDriver() {
        driver = null;
    }
}
