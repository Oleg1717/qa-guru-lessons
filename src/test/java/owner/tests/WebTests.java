package owner.tests;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import owner.config.WebConfig;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebTests {

    @BeforeAll
    static void setup() {
        WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());

        browser = config.browser();
        browserVersion = config.browserVersion();
        browserSize = config.browserSize();

        DesiredCapabilities capabilities = new DesiredCapabilities();

        if (!config.remoteDriverUrl().equals("")) {
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            remote = config.remoteDriverUrl();
        }
        browserCapabilities = capabilities;
    }

    @Test
    void selenideSearchTest() {
        open("https://yandex.ru/");
        $(byName("text")).setValue("selenide").pressEnter();
        $("#search-result").shouldHave(text("selenide.org"));
    }
}
