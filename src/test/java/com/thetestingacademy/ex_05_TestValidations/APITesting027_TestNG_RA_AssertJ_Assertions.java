package com.thetestingacademy.ex_05_TestValidations;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;

public class APITesting027_TestNG_RA_AssertJ_Assertions {

    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;

    String token;
    Integer bookingId;

    public void test_POST(){
        String payload = "{\n" +
                "    \"firstname\" : \"Prmaod\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
        requestSpecification= RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking/");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payload).log().all();

        Response response = requestSpecification.when().post();

        //Get Validatable response to perform validation
        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);

        //Rest Assured-> import.org.hamcrest.Matchers; %4-%5
        //Matchers.equalto()

        validatableResponse.body("booking.firstname",Matchers.equalTo("pramod"));
        validatableResponse.body("booking.lastname",Matchers.equalTo("Brown"));
        validatableResponse.body("booking.depositpaid",Matchers.equalTo(true));
        validatableResponse.body("bookingid", Matchers.notNullValue());

        //TestNG - Extract the Details of the firstname , booking id, lastname from
        bookingId = response.then().extract().path("bookingid");
        String firstname = response.then().extract().path("booking.firstname");
        String lastname = response.then().extract().path("booking.lastname");

        //TestNG Asserstions - 75%
        // SoftAssert vs
        // HardAssert -
        // This means that if any assertion fails
        // the remaining statements in that test method will not be executed

        Assert.assertEquals(firstname, "Pramod");
        Assert.assertEquals(lastname,"Dutta");
        Assert.assertNotNull(bookingId);

        //AsserJ
        assertThat(bookingId).isPositive().isNotNull().isNotZero();
        assertThat(firstname).isNotEmpty().isNotEmpty().isNotBlank().isNotNull().isEqualTo("Pramod");

        //String S =""; //Empty
        //String S2 =" " // blank

        






    }


}
