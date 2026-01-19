package com.company.api.Test.UserClient;

import com.company.api.Test.BaseTest.RequestSpecFactory;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserClient {
    private final String baseUri;

    public UserClient(String baseUri) {
        this.baseUri = baseUri;
    }

    public Response getUserClient(Integer id) {
        Response response = given()
                .spec(RequestSpecFactory.getSpec())
                .when()
                .get("/user/" + id);

        return response;
    }
}
