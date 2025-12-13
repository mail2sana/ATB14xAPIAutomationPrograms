package com.thetestingacademy.ex_05_TestNG_Advance_Examples;

import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class APITesting016_BeforeTest {
    //PUT Request
    //1.getToken
    //2.getBookingId
    //3.test_PUT(Which will use the above two methods)
    //4.closeAllThnigs

    @BeforeTest
    public void getBookingID(){
        System.out.println("Before GET Booking");
    }

    @BeforeTest
    public void getToken(){
        System.out.println("Before GET Token");
    }

    @Test
    public void test_PUT(){
        //token and BookingID
        System.out.println("PUT REQUEST");
    }

    @AfterTest
    public void closeAllThings(){
        System.out.println("Close");
    }

}
