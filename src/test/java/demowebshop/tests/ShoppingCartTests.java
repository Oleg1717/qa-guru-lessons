package demowebshop.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import demowebshop.config.ConfigHelper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;

public class ShoppingCartTests {

    static final String COMPUTER_DATA = "product_attribute_72_5_18=65&product_attribute_72_6_19=55" +
            "&product_attribute_72_3_20=58&product_attribute_72_8_30=94&addtocart_72.EnteredQuantity=1";
    Map<String, String> appCookie;
    String shoppingCartCount;

    @BeforeAll
    static void setup() {
        Configuration.baseUrl = ConfigHelper.getBaseUrl();
        Configuration.startMaximized = true;
        RestAssured.baseURI = ConfigHelper.getApiBaseUrl();
    }

    @Test
    void addingInShoppingCartCheck() {
        step("Get cookie by API", () -> {
            appCookie = given()
                    .formParam("Email", ConfigHelper.getLogin())
                    .formParam("Password", ConfigHelper.getPassword())
                    .when()
                    .post("/login")
                    .then()
                    .statusCode(302)
                    .extract()
                    .cookies();
        });

        step("Add computer to shopping cart using API", () -> {
            Response response = given()
                    .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                    .body(COMPUTER_DATA)
                    .cookies(appCookie)
                    .log().all()
                    .when()
                    .post("/addproducttocart/details/72/1")
                    .then()
                    .statusCode(200)
                    .body("success", is(true))
                    .body("message", containsString("The product has been added"))
                    .extract().response();
            shoppingCartCount = response.path("updatetopcartsectionhtml");
        });


        step("Check that computer adding in shopping cart", () -> {
            step("Open minimal content for adding cookie", () ->
                    open("/favicon.ico"));
            step("Add cookie", () ->
                    WebDriverRunner.getWebDriver().manage().addCookie(
                            new Cookie("NOPCOMMERCE.AUTH", appCookie.get("NOPCOMMERCE.AUTH"))));
            step("Open shopping cart", () ->
                    open("/cart"));
            step("Check shopping cart count", () ->
                    assertThat($(".cart-qty").getText()).isEqualTo(shoppingCartCount));
        });
    }
}
