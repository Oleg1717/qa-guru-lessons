package tests;

import components.RandomData;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

public class FormTests extends TestBase {

    RegistrationPage regPage = new RegistrationPage();
    RandomData rndData = new RandomData();

    @Test
    void positiveTypeTest() {

        //заполнение формы тестовыми данными
        regPage.openPage()
                .typeFirstName(rndData.firstName)
                .typeLastName(rndData.lastName)
                .typeEmail(rndData.email)
                .selectGender(rndData.gender)
                .typeMobileNumber(rndData.mobileNumber)
                .setDateOfBirth(rndData.dateOfBirth)
                .selectSubject(rndData.subject)
                .selectHobby(rndData.hobby)
                .uploadFile(rndData.fileName)
                .typeCurrentAddress(rndData.currentAddress)
                .selectState(rndData.state)
                .selectCity(rndData.city)
                .formSubmit();

        //проверка результата заполнения формы
        regPage.checkResultTitle()
                .checkResultValue("Student Name", rndData.firstName + " " + rndData.lastName)
                .checkResultValue("Student Email", rndData.email)
                .checkResultValue("Gender", rndData.gender)
                .checkResultValue("Mobile", rndData.mobileNumber)
                .checkResultValue("Date of Birth",
                        rndData.dateOfBirth[2] + " " + rndData.dateOfBirth[1] + "," + rndData.dateOfBirth[0])
                .checkResultValue("Subjects", rndData.subject)
                .checkResultValue("Hobbies", rndData.hobby)
                .checkResultValue("Picture", "foto.jpg")
                .checkResultValue("Address", rndData.currentAddress)
                .checkResultValue("State and City", rndData.state + " " + rndData.city);
    }
}
