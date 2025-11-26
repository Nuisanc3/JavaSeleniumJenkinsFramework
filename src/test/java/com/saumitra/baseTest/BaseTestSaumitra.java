package com.saumitra.baseTest;

import com.saumitra.base.CommonPageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.saumitra.utlis.SetDriverUtility;
import org.testng.annotations.BeforeTest;

import static com.saumitra.utlis.SetDriverUtility.setDriverUtility;

public class BaseTestSaumitra {


    private WebDriver driver;
    private String googleURL = "https://www.google.com/";

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        CommonPageObject pageObject = new CommonPageObject();
        pageObject.setDriver(driver);
        setDriverUtility();
    }

    @BeforeTest(dependsOnMethods = {"setUp"})
    public void loadApplication() {
        driver.get(googleURL);
    }

}
