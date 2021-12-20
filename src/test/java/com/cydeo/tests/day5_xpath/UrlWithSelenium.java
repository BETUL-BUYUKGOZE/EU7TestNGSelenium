package com.cydeo.tests.day5_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UrlWithSelenium {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.wikipedia.org/");

        driver.findElement(By.id("searchInput")).sendKeys("selenium webdriver");
        driver.findElement(By.xpath("//i[contains(text(),'Search')]")).click();

        String urlEndsWith = driver.getCurrentUrl();


        if(urlEndsWith.endsWith("Selenium_(software)")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        driver.quit();
    }
}
