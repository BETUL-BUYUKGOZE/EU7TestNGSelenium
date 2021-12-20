package com.cydeo.tests.reviews.week01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T01_YahooPractice {
    public static void main(String[] args) {

        //setup browser type
        WebDriverManager.chromedriver().setup();

        //how can
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.yahoo.com");

       String expectedTitle="Yahoo";

        String actualTitle =driver.getTitle();

        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("actualTitle = " + actualTitle);

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }
        driver.close();


    }
}
