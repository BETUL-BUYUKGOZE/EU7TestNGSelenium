package com.cydeo.tests.day2_webdriver_basics;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallWebDriverFactory {
    public static void main(String[] args) {
     //   String browserType;
        WebDriver driver= WebDriverFactory.getDriver("firefox");

        driver.get("https://www.google.com");

        String title = driver.getTitle();
        System.out.println("title = " + title);
    }
}
