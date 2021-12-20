package com.cydeo.tests.day7_types_of_elements;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledElements {

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement greenRadioBtn = driver.findElement(By.id("green"));

        //how to check any web element enabled or not
        System.out.println("greenRadioBtn.isEnabled() = " + greenRadioBtn.isEnabled());
        Assert.assertFalse(greenRadioBtn.isEnabled(),"verfy green radio button Not enabled (disabled)");

        greenRadioBtn.click();

    }
    @Test
    public void test2(){

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement inputBox=driver.findElement(By.cssSelector("#input-example>input"));

        inputBox.sendKeys("some messages");


    }
}

