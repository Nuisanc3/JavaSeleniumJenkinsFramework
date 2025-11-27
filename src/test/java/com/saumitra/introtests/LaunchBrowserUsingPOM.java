package com.saumitra.introtests;

import com.saumitra.baseTest.BaseTestSaumitra;
import com.saumitra.utlis.GetUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchBrowserUsingPOM extends BaseTestSaumitra {

    @Test
    public void verifyBrowserLaunchedAndGetCurrentURL() {
        String currentURL = getUtility.getURL();
        System.out.println("Browser successfully launched. URL : " + currentURL);

        // Use TestNG Assert instead of simple assert
        Assert.assertTrue(currentURL.contains("rahul"),
                "Current URL does not contain 'rahul'. Actual URL: " + currentURL);
    }
}