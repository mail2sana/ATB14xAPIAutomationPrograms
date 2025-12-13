package com.thetestingacademy.ex_05_TestNG_Advance_Examples;

import org.junit.Assert;
import org.testng.annotations.Test;

public class APITesting018_TestNG_Groups {

    // if more 1000 Test cases how will priortisize -> by using groups
    @Test(groups = {"Sanity","Reg"})
    public void test_SanityRun(){
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(true);
    }
    @Test(groups = {"Reg"})
    public void test_regRun(){
        System.out.println("Reg");
        Assert.assertTrue(false);
    }
@Test(groups={"Smoke"})
    public void test_smokeRun(){
        System.out.println("Smoke");
        Assert.assertTrue(false);
    }
}
