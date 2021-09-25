import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class FormTests {

    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.startMaximized = true;
    }

    @Test
    void positiveFillTest() {

        open("/automation-practice-form");

        // filling out the form
        $("#firstName").setValue("John");
        $("#lastName").setValue("Doe");
        $("#userEmail").setValue("jhon.doe@gmail.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("9876543210");

        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOption("1987");
        $(".react-datepicker__month-select").selectOption("June");
        $(by("aria-label","Choose Sunday, June 7th, 1987")).click();

        $("#subjectsInput").setValue("Computer Science").pressEnter();
        $("#subjectsInput").setValue("Maths").pressEnter();

        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();

        $("#uploadPicture").uploadFile(new File("src/test/resources/foto.jpg"));
        $("#currentAddress").setValue("Karnal-Sitamai Road");

        $("#state").scrollTo().click();
        $("#stateCity-wrapper").$(byText("Haryana")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Karnal")).click();

        $("#submit").click();

        //checking the result
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").$(byText("Student Name")).sibling(0).shouldHave(text("John Doe"));
        //$(".table-responsive").shouldHave(text("John Doe"));
        $(".table-responsive").shouldHave(text("jhon.doe@gmail.com"));
        $(".table-responsive").shouldHave(text("9876543210"));
        $(".table-responsive").shouldHave(text("07 June,1987"));
        $(".table-responsive").shouldHave(text("Computer Science, Maths"));
        $(".table-responsive").shouldHave(text("Sports, Music"));
        $(".table-responsive").shouldHave(text("foto.jpg"));
        $(".table-responsive").shouldHave(text("Karnal-Sitamai Road"));
        $(".table-responsive").shouldHave(text("Haryana Karnal"));
    }
}
