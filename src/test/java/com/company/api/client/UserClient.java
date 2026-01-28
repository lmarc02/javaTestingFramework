package com.company.api.client;

import com.company.api.baseTest.RequestSpecFactory;
import com.company.api.utils.EnvReader;
import com.company.api.utils.PollingUtils;
import io.github.cdimascio.dotenv.Dotenv;
import io.qameta.allure.Allure;
import io.restassured.response.Response;

import java.time.Duration;

import static io.restassured.RestAssured.given;

public class UserClient {

    public static Response getUserClient(Integer id) {

        Response response = given().log().all()
                .spec(RequestSpecFactory.getSpec())
                .header("x-api-key", EnvReader.getApiKey())
                .when()
                .get("/user/" + id);
        System.out.println(response.body().prettyPrint());
        Allure.addAttachment("Response Body", "application/json", response.body().prettyPrint());


        return response;
    }

    public static Response getUserClient(Integer id, String xApiKey) {
        Response response = given().log().all()
                .spec(RequestSpecFactory.getSpec())
                .header("x-api-key", xApiKey)
                .when()
                .get("/user/" + id);
        System.out.println(response.body().prettyPrint());
        Allure.addAttachment("Response Body", "application/json", response.body().prettyPrint());

        return response;
    }

    public static Response getUserClient(Integer userId, Duration timeOutDuration, Duration poolingDuration) throws InterruptedException {
        return PollingUtils.pollUntil(() -> UserClient.getUserClient(userId), timeOutDuration, poolingDuration, r -> r.getStatusCode() == 200);
    }
}
