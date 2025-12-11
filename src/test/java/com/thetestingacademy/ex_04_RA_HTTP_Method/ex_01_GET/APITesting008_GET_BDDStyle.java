package com.thetestingacademy.ex_04_RA_HTTP_Method.ex_01_GET;

import io.restassured.RestAssured;
import org.junit.Test;

public class APITesting008_GET_BDDStyle {
    @Test
    public void test_GET_Positive(){
        String pincode="560058";
        pincode ="110048";
        RestAssured
                .given()
                   .baseUri("https://api.zippopotam.us")
                   .basePath("/IN/"+pincode)
                .when()
                  .get()
                .then()
                   .log().all().statusCode(200);
    }
}
