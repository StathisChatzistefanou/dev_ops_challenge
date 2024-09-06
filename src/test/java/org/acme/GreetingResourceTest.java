package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.equalTo;

@QuarkusTest
class GreetingResourceTest {
    
    @Test
    void testHelloEndpoint() {
        given()
          .queryParam("param", "value")
          .when().get("/sample")
          .then()
             .statusCode(200)
             .contentType("application/json")
             .body("param", equalTo("value"));
    }
}
