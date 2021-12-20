package com.cydeo.tests.reviews.week01;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class T02_cybertekUrlTask {

    

    public static void main(String[] args) {


       //initialize my driver object
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //go to the page
        driver.get("http://practice.cybertekschool.com");

        //I want to maximize my page, sometimes selenium can not find element without maximize
        driver.manage().window().maximize();

        String expectedUrlText = "cybertekschool";
        String actualUrl=driver.getCurrentUrl();
        
        System.out.println("verify if the URL contains\"cybertekschool\":" + actualUrl.contains(expectedUrlText));
        System.out.println("Title verifiy:"+driver.getTitle().equalsIgnoreCase("Practice"));

        driver.close();


    }
}



