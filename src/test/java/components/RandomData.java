package components;

import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static utils.RandomUtils.getRandomDate;
import static utils.RandomUtils.getRandomItem;

public class RandomData {

    Faker faker = new Faker();

    List<String> genders = Arrays.asList("Male", "Female", "Other");
    List<String> subjects = Arrays.asList("Accounting", "Arts", "Civics", "Chemistry"
            , "Commerce", "Computer Science", "Economics", "Maths", "Physics", "Social Studies");
    List<String> hobbies = Arrays.asList("Sports", "Reading", "Music");
    List<String> states = Arrays.asList("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
    Map<String, List<String>> cities = new HashMap<>() {{
        put("NCR", Arrays.asList("Delhi", "Gurgaon", "Noida"));
        put("Uttar Pradesh", Arrays.asList("Agra", "Lucknow", "Merrut"));
        put("Haryana", Arrays.asList("Karnal", "Panipat"));
        put("Rajasthan", Arrays.asList("Jaipur", "Jaiselmer"));
    }};

    public String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            gender = getRandomItem(genders),
            mobileNumber = faker.phoneNumber().subscriberNumber(10),
            subject = getRandomItem(subjects),
            hobby = getRandomItem(hobbies),
            fileName = "foto.jpg",
            currentAddress = faker.address().fullAddress(),
            state = getRandomItem(states),
            city = getRandomItem(cities.get(state));
    public String[] dateOfBirth = getRandomDate();
}
