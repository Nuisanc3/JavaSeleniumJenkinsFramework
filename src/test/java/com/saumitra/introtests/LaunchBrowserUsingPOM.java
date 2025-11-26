package com.saumitra.introtests;
import com.saumitra.baseTest.BaseTestSaumitra;
import org.testng.annotations.Test;

import static com.saumitra.utlis.GetUtility.getURL;

public class LaunchBrowserUsingPOM extends BaseTestSaumitra {

    @Test
    public void verifyBrowserLaunchedAndGetCurrentURL() {
        String currentURL = getURL();
        System.out.println("Browser successfully launched. URL : " + currentURL);

        // Simple verification that the page loaded
        assert currentURL.contains("google") : "Current URL does not contain 'Google'";

        // The teardown() method from BaseTestSaumitra runs automatically after this method.
    }
}
