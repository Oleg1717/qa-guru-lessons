package allure.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.startMaximized;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;

public class LambdaStepsTest {

    private final static String REPOSITORY = "eroshenkoam/allure-example";
    private final static String ISSUE_NAME = "Listeners NamedBy";

    @BeforeAll
    static void setup() {
        startMaximized = true;
    }

    @Test
    public void testRepositoryIssue() {
        step("Group step", () -> {
            step("Открываем главную страницу",
                    () -> open("https://github.com"));
            step("Ищем репозиторий " + REPOSITORY,
                    () -> $(".header-search-input").val(REPOSITORY).pressEnter());
            step("Переходим в репозиторий " + REPOSITORY,
                    () -> $(linkText(REPOSITORY)).click());
            step("Переходим в раздел Issue",
                    () -> $("[data-tab-item=i1issues-tab]").click());
            step("Проверяем что существует Issue с названием " + ISSUE_NAME,
                    () -> $(byText(ISSUE_NAME)).shouldBe(visible));
        });
    }
}
