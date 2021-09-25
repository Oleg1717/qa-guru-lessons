package in.reqres;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import org.assertj.core.api.Assertions;
import org.awaitility.Awaitility;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static java.lang.String.format;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.is;

public class RestApiTests {

    private final static List<String> EXPECTED_PERSONS_LIST = asList("George Bluth     : george.bluth@reqres.in",
            "Janet Weaver     : janet.weaver@reqres.in",
            "Emma Wong        : emma.wong@reqres.in",
            "Eve Holt         : eve.holt@reqres.in",
            "Charles Morris   : charles.morris@reqres.in",
            "Tracey Ramos     : tracey.ramos@reqres.in",
            "Michael Lawson   : michael.lawson@reqres.in",
            "Lindsay Ferguson : lindsay.ferguson@reqres.in",
            "Tobias Funke     : tobias.funke@reqres.in",
            "Byron Fields     : byron.fields@reqres.in",
            "George Edwards   : george.edwards@reqres.in",
            "Rachel Howell    : rachel.howell@reqres.in");

    @Test
    void createUserTest() {
        String name = "Roman";
        String password = "kjhj^5";
        String requestJson = format("{\"name\": \"%s\",\"password\": \"%s\"}", name, password);
        given()
                .contentType(JSON)
                .body(requestJson)
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .statusCode(201)
                .body("name", is(name))
                .body("password", is(password));
    }

    @Test
    void getFullNamesOFUsers() {
        JsonArray jsonArray = new JsonArray();
        List<String> actualPersonsList = new ArrayList<>();

        for (int i = 1; i < 3; i++) {
            String path = format("https://reqres.in/api/users?page=%s", i);
            String responsePage = given()
                    .when().get(path)
                    .then()
                    .statusCode(200)
                    .body("data.size()", is(6))
                    .body("page", is(i))
                    .extract().response().asString();

            jsonArray.addAll(JsonParser.parseString(responsePage)
                    .getAsJsonObject().getAsJsonArray("data"));
        }

        for (int i = 0; i < jsonArray.size(); i++) {
            String firstName = jsonArray.get(i).getAsJsonObject().get("first_name").getAsString();
            String lastName = jsonArray.get(i).getAsJsonObject().get("last_name").getAsString();
            String email = jsonArray.get(i).getAsJsonObject().get("email").getAsString();
            String person = format("%-17s: %s", String.join(" ", firstName, lastName), email);
            actualPersonsList.add(person);
            System.out.println(person);
        }
        assertThat(actualPersonsList).hasSameElementsAs(EXPECTED_PERSONS_LIST);
    }


    @Test
    void successfulRegister() {
        String email = "eve.holt@reqres.in";
        String password = "pistol";
        String requestJson = format("{\"email\": \"%s\",\"password\": \"%s\"}", email, password);
        given()
                .contentType(JSON)
                .body(requestJson)
                .when()
                .post("https://reqres.in/api/register")
                .then()
                .statusCode(200)
                .body("id", is(4))
                .body("token", is("QpwL5tke4Pnpja7X4"));
    }

    @Test
    void registerWithWrongEmail() {
        String email = "mymail@reqres.in";
        String password = "dljhkjf&7";
        String requestJson = format("{\"email\": \"%s\",\"password\": \"%s\"}", email, password);
        given()
                .contentType(JSON)
                .body(requestJson)
                .when()
                .post("https://reqres.in/api/register")
                .then()
                .statusCode(400)
                .body("error", is("Note: Only defined users succeed registration"));
    }

    @Test
    void registerWithoutPassword() {
        String email = "sydney@fife";
        String requestJson = format("{\"email\": \"%s\"}", email);
        given()
                .contentType(JSON)
                .body(requestJson)
                .when()
                .post("https://reqres.in/api/register")
                .then()
                .statusCode(400)
                .body("error", is("Missing password"));
    }

    @Test
    void delayedResponse() {
        Awaitility.await().until(() ->
                given()
                        .get("https://reqres.in/api/users?delay=3")
                        .then()
                        .extract()
                        .statusCode() == 200);

    }

}
