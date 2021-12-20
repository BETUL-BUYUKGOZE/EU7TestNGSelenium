package com.cydeo.tests.day4_basic_locators;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocatorTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //make browser full screen
        driver.manage().window().maximize();


        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameInput = driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("Mike Smith");

        //put some email and click sign up button

        //proper way
//           WebElement emailInputBox =driver.findElement(By.name("email"));
//              emailInputBox.sendKeys("mike@smith.com");

              //lazy way
        driver.findElement(By.name("email")).sendKeys("mike@smith.com");
        driver.findElement(By.name("email")).click();

//              WebElement signUpButton = driver.findElement(By.name("wooden_spoon"));
//              signUpButton.click();

              driver.findElement(By.name("wooden_spoon")).click();






    }
}
