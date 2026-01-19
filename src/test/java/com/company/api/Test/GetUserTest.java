package com.company.api.Test;

import com.company.api.BaseTest.BaseTest;
import com.company.api.BaseTest.RequestSpecFactory;
import com.company.api.Listeners.TestListener;
import com.company.api.UserClient.UserClient;
import com.company.api.Utils.ConfigReader;
import com.company.api.Utils.DataProviders;
import com.company.api.Utils.PollingUtils;
import io.qameta.allure.Allure;
import io.restassured.response.Response;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;

@Listeners({ TestListener.class})
public class GetUserTest extends BaseTest {

    @BeforeMethod
    public void setup() {
        RequestSpecFactory.initSpec(ConfigReader.get("userBaseUri"));
    }

    @AfterMethod
    public void tearDown() {
        RequestSpecFactory.removeSpec();
    }

    @Test(dataProvider = "getUsersProviderMethod", dataProviderClass = DataProviders.class)
    public void getUser(Integer userId, String name) throws InterruptedException {
        Thread.sleep(2000);
        UserClient userClient = new UserClient(ConfigReader.get("userBaseUri"));

        Response response = PollingUtils.pollUntil(() -> userClient.getUserClient(userId), Duration.ofSeconds(30), Duration.ofSeconds(2), r -> r.getBody().asString().contains(name));
        response.then().statusCode(200);
        response.body().prettyPrint();
        Allure.addAttachment("Response Body", "application/json", response.asString());
    }

    @Test(dataProvider = "getUsersProviderMethod", dataProviderClass = DataProviders.class)
    public void getUser2(Integer userId, String name) throws InterruptedException {
        Thread.sleep(2000);
        UserClient userClient = new UserClient(ConfigReader.get("userBaseUri"));

        Response response = PollingUtils.pollUntil(() -> userClient.getUserClient(userId), Duration.ofSeconds(30), Duration.ofSeconds(2), r -> r.getBody().asString().contains(name));
        response.then().statusCode(200);
        response.body().prettyPrint();
        Allure.addAttachment("Response Body", "application/json", response.asString());
    }

    @Test(dataProvider = "getUsersProviderMethod", dataProviderClass = DataProviders.class)

    public void getUser3(Integer userId, String name) throws InterruptedException {
        Thread.sleep(2000);
        UserClient userClient = new UserClient(ConfigReader.get("userBaseUri"));

        Response response = PollingUtils.pollUntil(() -> userClient.getUserClient(userId), Duration.ofSeconds(30), Duration.ofSeconds(2), r -> r.getBody().asString().contains(name));
        response.then().statusCode(200);
        response.body().prettyPrint();
        Allure.addAttachment("Response Body", "application/json", response.asString());
    }

    @Test(dataProvider = "getUsersProviderMethod", dataProviderClass = DataProviders.class)
    public void getUser4(Integer userId, String name) throws InterruptedException {
        Thread.sleep(2000);
        UserClient userClient = new UserClient(ConfigReader.get("userBaseUri"));

        Response response = PollingUtils.pollUntil(() -> userClient.getUserClient(userId), Duration.ofSeconds(30), Duration.ofSeconds(2), r -> r.getBody().asString().contains(name));
        response.then().statusCode(200);
        response.body().prettyPrint();
        Allure.addAttachment("Response Body", "application/json", response.asString());
    }

    @Test(dataProvider = "getUsersProviderMethod", dataProviderClass = DataProviders.class)
    public void getUser5(Integer userId, String name) throws InterruptedException {
        Thread.sleep(2000);
        UserClient userClient = new UserClient(ConfigReader.get("userBaseUri"));

        Response response = PollingUtils.pollUntil(() -> userClient.getUserClient(userId), Duration.ofSeconds(30), Duration.ofSeconds(2), r -> r.getBody().asString().contains(name));
        response.then().statusCode(200);
        response.body().prettyPrint();
        Allure.addAttachment("Response Body", "application/json", response.asString());
    }
}
