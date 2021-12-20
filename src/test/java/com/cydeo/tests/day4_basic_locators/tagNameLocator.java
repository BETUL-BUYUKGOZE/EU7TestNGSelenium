package com.cydeo.tests.day4_basic_locators;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tagNameLocator {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");


        driver.get("http://practice.cybertekschool.com/sign_up");
        driver.findElement(By.tagName("input")).sendKeys("Mike Smith With TagName");

        driver.findElement(By.name("email")).sendKeys("mike@smith.com");

        driver.findElement(By.tagName("button")).click();

        Thread.sleep(3000);
        driver.close();

    }
}
