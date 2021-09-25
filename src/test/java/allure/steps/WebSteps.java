package allure.steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class WebSteps {

    @Step("Открываем главную страницу")
    public void openMainPage() {
        open("https://github.com");
    }

    @Step("Ищем репозиторий {repository}")
    public void findRepository(String repository) {
        $(".header-search-input").val(repository).pressEnter();
    }

    @Step("Переходим в репозиторий {repository}")
    public void goToRepository(String repository) {
        $(linkText(repository)).click();
    }

    @Step("Переходим в раздел Issues")
    public void openIssuesTab() {
        $("[data-tab-item=i1issues-tab]").click();
    }

    @Step("Проверяем что существует Issue с названием {number}")
    public void shouldSeeIssueWithText(String issue) {
        $(byText(issue)).shouldBe(visible);
    }
}
