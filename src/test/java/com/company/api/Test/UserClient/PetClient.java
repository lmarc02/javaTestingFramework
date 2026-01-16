package com.company.api.Test.UserClient;

import com.company.api.Test.Models.PetRequest;
import com.company.api.Test.Utils.Utils;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.response.Response;

import com.fasterxml.jackson.databind.ObjectMapper;

import static io.restassured.RestAssured.given;

public class PetClient {

    public Response createPet(PetRequest petObj) throws JsonProcessingException {

        String json = Utils.getStringJsonResponse(petObj);
        Response response =  given()
                .contentType("application/json")
                .body(json)
                .when()
                .post("/pet");
        System.out.println(response.body().prettyPrint());
        return response;
    }
}
