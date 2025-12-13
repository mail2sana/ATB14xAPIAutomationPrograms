package com.thetestingacademy.ex_05_TestNG_Advance_Examples;

import org.testng.annotations.Test;

public class APITesting023_TestNG_Invocation {

    // invocation meaans how many time wants to run
    @Test
    public void test01(){
        System.out.println("Hi");
    }

    @Test(invocationCount = 2)
    public void test02(){
        System.out.println("bye");
    }
}
