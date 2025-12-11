package com.thetestingacademy.ex_04_RA_HTTP_Method.ex_01_GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

public class APITesting009_GET_NON_BDDStyle {
    @Test
    public void test_GET_NON_BDD() {
        String pincode = "560049";
        //Divide your program into 3 parts

        // Given -Part1
        RequestSpecification r = RestAssured.given();
        r.baseUri("\"https://api.zippopotam.us\"");
        r.basePath("\"/IN/\"+pincode");

        //When -Part2
        Response response = r.when().log().all().get();
        System.out.println(response.asString());

        //Then -Part3
        ValidatableResponse vr = response.then().log().all();
        vr.statusCode(200);

        //write further testcases or assertions also here

    }
}

