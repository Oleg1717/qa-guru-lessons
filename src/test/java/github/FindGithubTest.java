package github;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.startMaximized;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FindGithubTest {

    @BeforeAll
    static void setup() {
        startMaximized = true;
    }

    @Test
    void checkJUnit5Code() {
        //Открыть страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        //Перейти в раздел Wiki проекта
        $("[data-tab-item=i4wiki-tab]").click();
        //Убедиться, что в списке страниц (Pages) есть страница SoftAssertions
        //Открыть страницу SoftAssertions
        $(".js-wiki-more-pages-link").click();
        $(".wiki-rightbar").$(byText("SoftAssertions")).click();
        //Проверить что внутри есть пример кода для JUnit5
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class:"));
    }
}
