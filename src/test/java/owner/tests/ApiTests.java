package owner.tests;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import owner.config.ApiConfig;

import static io.restassured.RestAssured.given;

public class ApiTests {

    @Test
    public void apiTest() {
        ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());

        given()
                .header("x-rapidapi-key", config.apiKey())
                .header("x-rapidapi-host", config.apiHost())
                .when().get(config.baseUrl())
                .then().statusCode(202).assertThat();
    }
}
