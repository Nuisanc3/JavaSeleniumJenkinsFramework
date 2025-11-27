package com.saumitra.baseTest;

import com.saumitra.utlis.GetUtility;
import com.saumitra.utlis.SetDriverUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class BaseTestSaumitra {

    protected WebDriver driver;
    protected GetUtility getUtility;

    private String appURL = "https://rahulshettyacademy.com/#/index";

    @BeforeMethod
    public void setupTest() {
        // 1. Setup the driver instance for the current thread
        SetDriverUtility.setDriver();
        driver = SetDriverUtility.getDriver();

        // 2. Launch the specified URL
        launchApplication(appURL);
    }

    public void launchApplication(String url) {
        System.out.println("Launching application URL: " + url);
        driver.get(url);
    }

    @AfterMethod
    public void tearDownTest() {
        // Quit the driver and clean up ThreadLocal
        SetDriverUtility.quitDriver();
    }
}