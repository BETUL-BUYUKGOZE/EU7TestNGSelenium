package com.cydeo.tests.day6_css;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cssLocator {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement dontClick = driver.findElement(By.cssSelector("#disappearing_button"));
         System.out.println(dontClick.getText());
         driver.quit();
    }
}

//<button id="disappearing_button">Don't click!</button>
//xpath--> //button[@id='disappearing_button']
//css--> button#disappearing_button

//<a class="nav-link">
// xpath--> //a[@class='nav-link']
//css--> a.nav-link