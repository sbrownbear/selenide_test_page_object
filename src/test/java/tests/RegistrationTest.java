package tests;

import org.junit.jupiter.api.Test;

public class RegistrationTest extends TestBase {

    @Test
    void successfulRegistrationTest() {

        registrationPage.openPage()
                .setFirstName("Sergey")
                .setLastName("Konoplev")
                .setUserEmail("sergeyKonoplev@gmail.com")
                .setGenderWrapper("Other")
                .setUserNumber("8987505883")
                .setDateOfBirth("30","July", "2008")
                .setSubjects("Math")
                .setHobbies("Sports")
                .setUploadPic("img/1.png")
                .setCurrentAddress("Planetnaya 23")
                .setState("NCR")
                .setCity("Delhi")
                .setSubmit();

        registrationPage.verifyResultsModalAppears()
                .verifyResult("Student Name", "Sergey Konoplev")
                .verifyResult("Student Email", "sergeyKonoplev@gmail.com")
                .verifyResult("Gender", "Other")
                .verifyResult("Mobile", "8987505883")
                .verifyResult("Date of Birth", "30 July,2008")
                .verifyResult("Subjects", "Math")
                .verifyResult("Hobbies", "Sports")
                .verifyResult("Picture", "1.png")
                .verifyResult("Address", "Planetnaya 23")
                .verifyResult("State and City", "NCR Delhi");
    }
}