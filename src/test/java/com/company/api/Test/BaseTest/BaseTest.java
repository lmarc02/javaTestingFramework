package com.company.api.Test.BaseTest;

import com.company.api.Test.Utils.ConfigReader;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    @BeforeSuite
    public void suiteSetup() {
        String env = System.getProperty("env", "dev");
        ConfigReader.load("config/" + env + ".properties");
    }

    @BeforeMethod
    public void setup() {
        RequestSpecFactory.initSpec(ConfigReader.get("userBaseUri"));
    }

}
