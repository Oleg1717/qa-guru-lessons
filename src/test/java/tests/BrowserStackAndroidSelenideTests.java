package tests;

import io.appium.java_client.MobileBy;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

@Tag("selenide_android")
@Feature("Wikipedia android app tests")
public class BrowserStackAndroidSelenideTests extends TestBase {

    @Test
    @DisplayName("Successful search")
    void searchTest() {
        step("Type search", () -> {
            $(MobileBy.AccessibilityId("Search Wikipedia")).click();
            $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).val("BrowserStack");
        });
        step("Verify content found", () ->
                $$(MobileBy.id("org.wikipedia.alpha:id/page_list_item_container"))
                        .shouldHave(sizeGreaterThan(0)));
    }

    @Test
    @DisplayName("Hide 'In the news' card")
    void hideNewsCard() {
        step("Click 'In the news' card menu", () ->
                $$(MobileBy.id("org.wikipedia.alpha:id/view_list_card_header_menu")).get(0).click());
        step("Click 'Hide this card' menu item", () ->
                $(MobileBy.id("org.wikipedia.alpha:id/title")).shouldHave(text("Hide this card")).click());
        step("Check that 'In the news' card hidden", () ->
                $(MobileBy.id("org.wikipedia.alpha:id/view_card_header_title")).shouldHave(text("Featured article")));
    }
}