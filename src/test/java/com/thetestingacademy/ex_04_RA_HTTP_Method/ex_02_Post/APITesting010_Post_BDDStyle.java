package com.thetestingacademy.ex_04_RA_HTTP_Method.ex_02_Post;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Test;

public class APITesting010_Post_BDDStyle {
    @Test
    public void test_Post_Auth_Token(){
        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON)
                .log().all()
                .body(payload)

                .when().post()

                .then().log().all().statusCode(200);

    }

}
