package com.company.api.Test;

import com.company.api.Test.BaseTest.BaseTest;
import com.company.api.Test.Listeners.TestListener;
import com.company.api.Test.Models.PetCategoryRequest;
import com.company.api.Test.Models.PetRequest;
import com.company.api.Test.Models.PetTagRequest;
import com.company.api.Test.UserClient.PetClient;
import com.company.api.Test.Utils.ConfigReader;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.text.IsEmptyString.emptyOrNullString;


@Listeners({ TestListener.class})
public class PostPetTest extends BaseTest {

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = ConfigReader.get("petBaseUri");
    }

    @Test
    public void postPet() throws JsonProcessingException {
        PetClient petClient = new PetClient();
        PetRequest myPet = new PetRequest(
                1,
                new PetCategoryRequest(1,"Dog"),
                new ArrayList<>(Arrays.asList("category string")),
                "Max",
                new ArrayList<>(Arrays.asList(new PetTagRequest(1,"tag string"))),
                "true" );

                Response response = petClient.createPet(myPet);
                response.then()
                        .statusCode(200)
                        .body("id", not(emptyOrNullString()))
                        .body("name", equalTo("Max"))
                        .body("tags.name[0]", equalTo("tag string"));
    }

}
