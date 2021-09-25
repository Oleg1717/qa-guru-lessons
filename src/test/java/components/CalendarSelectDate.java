package components;

import static com.codeborne.selenide.Selenide.$;
import static java.lang.String.format;

public class CalendarSelectDate {

    public void selectDate(String year, String month, String day) {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__month-select").selectOption(month);
        $(format(".react-datepicker__day--0%s" +
                ":not(.react-datepicker__day--outside-month)", day)).click();
    }
}
