package com.company.api.Test;

import com.company.api.Test.BaseTest.BaseTest;
import com.company.api.Test.Listeners.TestListener;
import com.company.api.Test.UserClient.UserClient;
import com.company.api.Test.Utils.ConfigReader;
import io.qameta.allure.Allure;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ TestListener.class})
public class GetUserTest extends BaseTest {

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = ConfigReader.get("userBaseUri");
    }
    @Test
    public void getUser(){
        UserClient userClient = new UserClient();
        Response response = userClient.getUserClient(1);
        response.then().statusCode(200);
        response.body().prettyPrint();
        Allure.addAttachment("Response Body", "application/json", response.asString());
    }
}
