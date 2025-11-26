package com.saumitra.baseTest;

import com.saumitra.utlis.GetUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class BaseTestSaumitra {

    protected WebDriver driver;
    protected GetUtility getUtility;

    @BeforeTest
    public void setUp() {
        driver.manage().window().maximize();

        // Initialize utility with driver
        getUtility = new GetUtility(driver);

        // Load application
        driver.get();
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}