package tests;

import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.startMaximized;

public class TestBase {
    @BeforeAll
    static void setup() {
        baseUrl = "https://demoqa.com";
        startMaximized = true;
    }
}
