package guru.qa.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

public class SearchTests {

    @Test
    void selenideSearchTest() {
        open("https://yandex.ru/");

        $(byName("text")).setValue("selenide").pressEnter();

        $("#search-result").shouldHave(text("selenide.org"));
    }
}