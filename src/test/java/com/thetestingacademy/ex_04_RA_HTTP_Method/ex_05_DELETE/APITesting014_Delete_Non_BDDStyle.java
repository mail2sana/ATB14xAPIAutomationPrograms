package com.thetestingacademy.ex_04_RA_HTTP_Method.ex_05_DELETE;

import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

public class APITesting014_Delete_Non_BDDStyle {
    // PUT
    //Pre-Req.
    //token, booking id - A

    //public void get_token(){}
    //public void get_booking_id(){}

    //NOn BDD style
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_put_non_bdd(){
        String token = "69959c38436088d";
        String bookingid="4780";

        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+bookingid);

        r.contentType(ContentType.JSON);
        r.cookie("token",token);
        // r.auth().digest()
        //r.auth().bassic()

        response = r.when().log().all().delete();

        vr=response.then().log().all();
        vr.statusCode(200);
    }
}
