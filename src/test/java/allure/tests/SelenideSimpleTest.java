package allure.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.startMaximized;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class SelenideSimpleTest {

    private final static String REPOSITORY = "eroshenkoam/allure-example";
    private final static String ISSUE_NAME = "Listeners NamedBy";

    @BeforeAll
    static void setup() {
        startMaximized = true;
    }

    @Test
    public void testRepositoryIssue() {
        open("https://github.com");
        $(".header-search-input").val(REPOSITORY).pressEnter();
        $(linkText(REPOSITORY)).click();
        $("[data-tab-item=i1issues-tab]").click();
        $(byText(ISSUE_NAME)).shouldBe(visible);
    }
}
