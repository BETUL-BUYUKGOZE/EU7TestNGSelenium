package com.cydeo.tests.day4_basic_locators;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class linkText_partialLinkText {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading");

       // driver.findElement(By.linkText("Example 1: Element on page that is hidden and become visible after trigger")).click();

        WebElement link4 = driver.findElement(By.linkText("Example 4"));
        link4.click();
    }
}
