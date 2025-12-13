package com.thetestingacademy.ex_05_TestNG_Advance_Examples;

import org.testng.annotations.Test;

public class APITesting017_TestNG_Priority {

    @Test(priority=3) // priority -> -1 ,-100 , -2 === 0
    public void test_t1(){
        System.out.println("1");
    }
    @Test(priority=1)
    public void test_t2(){
        System.out.println("2");
    }
    @Test(priority=2)
    public void test_t3(){
        System.out.println("3");
    }

    //231 - o/p
}
