package com.thetestingacademy.ex_05_TestNG_Advance_Examples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITesting024_TestNG_AllAnotations {

    @BeforeTest
    void demo4(){
        System.out.println("Before method");
    }
    @Test
    void demo5(){
        System.out.println("Test");
    }
    @AfterTest
    void demo6(){
        System.out.println("After Method");
    }
}
