package com.thetestingacademy.ex_05_TestNG_Advance_Examples;

import org.testng.annotations.*;

public class APITesting023_TestNG_AllAnotation {

    @BeforeSuite
    void demo1(){
        System.out.println("Before suite");
    }
@BeforeTest
    void demo2(){
        System.out.println("Before test");
    }
    @BeforeClass
    void demo3(){
        System.out.println("Before class");
    }
    @BeforeMethod
    void demo4(){
        System.out.println("Before method");
    }
@Test
    void demo5(){
        System.out.println("Test");
    }
    @AfterMethod
    void demo6(){
        System.out.println("After Method");
    }
@AfterClass
    void demo7(){
        System.out.println("After class");
    }
@AfterTest
    void demo8(){
        System.out.println("After test");
    }
@AfterSuite
    void demo9(){
        System.out.println("After suite");
    }
}
