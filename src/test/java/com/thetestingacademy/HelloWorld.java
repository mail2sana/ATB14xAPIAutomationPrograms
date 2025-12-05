package com.thetestingacademy;

import io.restassured.RestAssured;

public class HelloWorld {
    public static void main(String[] args) {
        RestAssured
                .given().baseUri("https://www.google.com/").log().all()
                .when().get()
                .then().log().all();
    }
}
