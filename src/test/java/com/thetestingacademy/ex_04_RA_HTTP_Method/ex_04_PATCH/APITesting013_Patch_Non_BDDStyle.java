package com.thetestingacademy.ex_04_RA_HTTP_Method.ex_04_PATCH;

import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

public class APITesting013_Patch_Non_BDDStyle {
    // PUT
    //Pre-Req.
    //token, booking id - A

    //public void get_token(){}
    //public void get_booking_id(){}

    //NOn BDD style
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
//Faker lib
    Faker faker = new Faker();
    String name=faker.name().fullName();
    //System.out.println(name);

    @Test
    public void test_put_non_bdd(){
        String token = "69959c38436088d";
        String bookingid="4780";


        String payloadpatch = "{\n" +
                "    \"firstname\" : \"Lucky\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "}";
        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+bookingid);

        r.contentType(ContentType.JSON);
        r.cookie("token",token);
        // r.auth().digest()
        //r.auth().bassic()
        r.body(payloadpatch).log().all();

        response = r.when().log().all().patch();

        vr=response.then().log().all();
        vr.statusCode(200);
    }
}
