package com.thetestingacademy.ex_05_TestNG_Advance_Examples;

import org.junit.Assert;
import org.testng.annotations.Test;

public class APITesting022_TestNG_AlwaysRun {

    @Test
    public void test_new_register(){
        Assert.assertTrue(true);
    }
 @Test(alwaysRun = true)
    public void test_loginpage(){
        Assert.assertTrue(true);
    }
@Test
    public void test_normal(){
        Assert.assertTrue(true);
    }
}
