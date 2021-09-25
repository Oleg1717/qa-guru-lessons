package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.lang.module.FindException;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.startMaximized = true;
    }

    @Test
    void positiveFillTest() {
        open("/text-box");
        $("#userName").setValue("Vladimir");
        $("#userEmail").setValue("vlad.r@gmail.com");
        $("#currentAddress").setValue("Moskovskaya st., 25");
        $("#permanentAddress").setValue("Baklanovskiy 200");
        $("#submit").click();

        $("#name").shouldHave(text("Vladimir"));
        $("#email").shouldHave(text("vlad.r@gmail.com"));
        $("#currentAddress", 1).shouldHave(text("Moskovskaya st., 25"));
        $("p#permanentAddress").shouldHave(text("Baklanovskiy 200"));
    }
}
