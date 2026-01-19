package com.company.api.UserClient;

import com.company.api.BaseTest.RequestSpecFactory;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserClient {

    public static Response getUserClient(Integer id) {
         String xApiKey = System.getProperty("xApiKey");
        Response response = given()
                .spec(RequestSpecFactory.getSpec())
                .header("x-api-key", xApiKey)
                .when()
                .get("/user/" + id);

        return response;
    }
}
