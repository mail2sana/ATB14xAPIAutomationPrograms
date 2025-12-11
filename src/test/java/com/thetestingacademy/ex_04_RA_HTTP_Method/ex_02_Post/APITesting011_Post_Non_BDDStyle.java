package com.thetestingacademy.ex_04_RA_HTTP_Method.ex_02_Post;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.Validatable;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

public class APITesting011_Post_Non_BDDStyle {

    RequestSpecification r;
    Response res;
    ValidatableResponse vr;

    @Test
    public void test_POST_NON_BDDStyle_Create_Token(){
        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        System.out.println("---------Part1------------");

        r = RestAssured.given();
        r.baseUri("");
        r.basePath("");
        r.contentType(ContentType.JSON);
        r.body(payload).log().all();

        System.out.println("---------Part2------------");
        //Making HTTP Request ->part2
        res = r.when().log().all().post();

        System.out.println("---------Part3------------");
        //Verification part -> Part3
        vr=res.then().log().all();
        vr.statusCode(200);




    }

}
