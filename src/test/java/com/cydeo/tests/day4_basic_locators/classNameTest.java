package com.cydeo.tests.day4_basic_locators;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class classNameTest {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");


        driver.get("http://practice.cybertekschool.com/sign_up");

        driver.findElement(By.className("nav-link")).click();


        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //multiple buttons header print
        System.out.println(driver.findElement(By.className("h3")).getText());


        driver.quit();
    }
}
