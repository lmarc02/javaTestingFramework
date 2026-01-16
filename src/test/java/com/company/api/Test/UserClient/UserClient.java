package com.company.api.Test.UserClient;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserClient {
    public Response getUserClient(Integer id){
        Response response = given()
                .contentType("application/json")
                .when().get("/user/" + id);

        return response;
    }
}
