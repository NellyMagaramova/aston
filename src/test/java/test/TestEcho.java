package test;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.RestAssured;


import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class TestEcho {
    @BeforeEach
    public void init(){
        RestAssured.baseURI = "https://postman-echo.com";
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }

    // просто get запрос
    @Test
    public void testGet1(){
        RequestSpecification req = given();
        req.when().get("/get").then().statusCode(200);
    }

    // с параметрами
    @Test
    public void testGet2(){
       /* RequestSpecification req = given().queryParams("foo1", "testValue"); */
        RequestSpecification req = given().queryParams("param1", "param1Value");
        req.when().get("/get").then().statusCode(200);
    }

    // проверяем значение поля из ответа json
    @Test
    public void testGet3(){
        RequestSpecification req = given().queryParams("foo1","bar1","foo2", "bar2");
        req.when().get("/get").then().statusCode(200).and().body("args.foo1", equalTo("bar1"));
    }

    // проверяем значение поля из ответа json
    @Test
    public void testPost1(){
        RequestSpecification req = given()
                .header("Content-type", "application/json")
                .formParams("test", "value");


        Response response = req
                .when()
                .post("/post")
                .then()
                .extract().response();


        Assertions.assertEquals(200, response.statusCode());
        Assertions.assertEquals("test=value", response.jsonPath().getString("data"));

    }

    @Test
    public void testPut(){
        RequestSpecification req = given()
                .header("Content-type", "application/json")
                .formParams("foo1", "value");


        Response response = req
                .when()
                .put("/put")
                .then()
                .extract().response();


        Assertions.assertEquals(200, response.statusCode());
    }

    @Test
    public void testPatch(){
        RequestSpecification req = given()
                .header("Content-type", "application/json")
                .formParams("foo1", "value");


        Response response = req
                .when()
                .patch("/patch")
                .then()
                .extract().response();


        Assertions.assertEquals(200, response.statusCode());

    }

    @Test
    public void testDelete(){
        RequestSpecification req = given()
                .header("Content-type", "application/json")
                .formParams("id","1");


        Response response = req
                .when()
                .delete("/delete")
                .then()
                .extract().response();


        Assertions.assertEquals(200, response.statusCode());

    }







}
