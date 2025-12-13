package com.thetestingacademy.ex_05_TestNG_Advance_Examples;

import org.junit.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITesting020_TestNG_Parameter {

    @Parameters("browser")
    @Test
    public void demo1(String value){
        System.out.println("Hi I'm demo");
        System.out.println("You are running this param");

        String anotherString;
        if (value.equalsIgnoreCase(anotherString = "chrome")){
            System.out.println("Start the Chrome");
        }
        if (value.equalsIgnoreCase(anotherString="firefox")){
            System.out.println("Start the firefox");
        }
    }

    public static class APITesting021_TestNG_Enabled {

    @Test
        public void test01(){
            Assert.assertTrue(true);
        }
    @Test(enabled = false)
        public void test02(){
            Assert.assertTrue(true);
        }
    @Test
        public void test03(){
            Assert.assertTrue(true);
        }
    }
}
