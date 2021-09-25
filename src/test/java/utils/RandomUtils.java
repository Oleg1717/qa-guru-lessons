package utils;

import com.github.javafaker.Faker;

import java.util.*;

public class RandomUtils {

    public static String getRandomItem(List<String> items) {
        return items.get(new Random().nextInt(items.size()));
    }

    public static String[] getRandomDate() {

        Faker faker = new Faker();
        Date date = faker.date().birthday();
        Calendar dateOfBirth = new GregorianCalendar();
        dateOfBirth.setTime(date);
        String dateYear = Integer.toString(dateOfBirth.get(Calendar.YEAR));
        String dateMonth = dateOfBirth.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);
        String dateDay = String.format("%02d", dateOfBirth.get(Calendar.DAY_OF_MONTH));
        return new String[]{dateYear, dateMonth, dateDay};
    }
}