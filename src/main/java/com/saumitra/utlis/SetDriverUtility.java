package com.saumitra.utlis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class SetDriverUtility {

    // WARNING: This static variable approach is NOT safe for parallel execution.
    private static WebDriver driver;

    public static void setDriver() {
        // Initialize the WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static WebDriver getDriver() {
        // Returns the single static instance
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null; // Set it back to null after quitting
        }
    }
}
