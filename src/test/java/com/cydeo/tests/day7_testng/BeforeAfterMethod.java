package com.cydeo.tests.day7_testng;

import org.testng.annotations.*;

public class BeforeAfterMethod {
    @BeforeClass
    public void setUpClass(){
        System.out.println("--BEFORE CLASS--");
        System.out.println("executed one time before the class");
    }
    @Test
    public void test1(){
        System.out.println("First test case");
    }

    @Ignore //yazilan test calismaz
    @Test
    public void test2(){
        System.out.println("Second test case");
    }
    @Test
    public void test3(){
        System.out.println("Third test case");
    }
    @BeforeMethod
    public void setUp(){
        System.out.println("WebDriver,Opening Browser");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("Closing Browser,Quit");
    }
    @AfterClass
    public void tearDownClass(){
        System.out.println("--AFTER CLASS--");
        System.out.println("Some reporting code here");
        System.out.println("Closing Browser,Quit");
    }
}
