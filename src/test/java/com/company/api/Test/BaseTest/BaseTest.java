package com.company.api.Test.BaseTest;

import com.company.api.Test.Utils.ConfigReader;
import io.restassured.RestAssured;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.Properties;

public class BaseTest {
    @BeforeTest
    public void setup(){
        System.getProperty("env", "dev");
        ConfigReader.load("config/dev.properties");
        }

    @AfterClass
    public void tearDown() {
        RestAssured.reset();
    }

}
