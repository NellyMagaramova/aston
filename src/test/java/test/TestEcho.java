package test;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.RestAssured;



public class TestEcho {
    String baseUrl = "https://postman-echo.com/";
    @Test
    public void testGet(){
        /*given().pathParam()
                .when()
                .then()

         */

    }

    @Test
    void testPostRawText(){

    }

    @Test
    void testPostFormData(){

    }

    @Test
    void testPut(){

    }

    @Test
    void testPatch(){

    }

    @Test
    void testDelete(){

    }

}
