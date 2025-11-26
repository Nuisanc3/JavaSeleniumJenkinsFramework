package com.saumitra.utlis;

import com.saumitra.base.CommonPageObject;
import org.openqa.selenium.WebDriver;

public class SetDriverUtility {

        public static WebDriver driver;

        public static void setDriverUtility() {
            driver = CommonPageObject.driver;
        }
    }
